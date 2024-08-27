package org.xmanga.soft.parsers.site.galleryadults.all

import org.xmanga.soft.parsers.ErrorMessages
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.*
import org.xmanga.soft.parsers.site.galleryadults.GalleryAdultsParser
import org.xmanga.soft.parsers.util.domain
import org.xmanga.soft.parsers.util.oneOrThrowIfMany
import org.xmanga.soft.parsers.util.parseHtml
import org.xmanga.soft.parsers.util.urlEncoded
import java.util.*

@MangaSourceParser("HENTAIENVY", "HentaiEnvy", type = ContentType.HENTAI)
internal class HentaiEnvy(context: MangaLoaderContext) :
	GalleryAdultsParser(context, MangaParserSource.HENTAIENVY, "hentaienvy.com", pageSize = 24) {
	override val selectGalleryLink = "a"
	override val selectGalleryTitle = "div.title"
	override val selectTags = ".tags_items"
	override val selectTag = ".gt_right_tags ul:contains(Tags:)"
	override val selectAuthor = ".gt_right_tags ul:contains(Artists:) a"
	override val selectLanguageChapter = ".gt_right_tags ul:contains(Languages:) a"
	override val idImg = "fimg"

	override val availableSortOrders: Set<SortOrder> = EnumSet.of(SortOrder.UPDATED, SortOrder.POPULARITY)

	override suspend fun getListPage(page: Int, filter: MangaListFilter?): List<Manga> {
		val url = buildString {
			append("https://")
			append(domain)
			when (filter) {
				is MangaListFilter.Search -> {
					append("/search/?s_key=")
					append(filter.query.urlEncoded())
					append("&")
				}

				is MangaListFilter.Advanced -> {
					if (filter.tags.isNotEmpty()) {
						if (filter.locale != null) {
							throw IllegalArgumentException(ErrorMessages.FILTER_BOTH_LOCALE_GENRES_NOT_SUPPORTED)
						}
						filter.tags.oneOrThrowIfMany()?.let {
							append("/tag/")
							append(it.key)
							if (filter.sortOrder == SortOrder.POPULARITY) {
								append("/popular")
							}
							append("/?")
						}
					} else if (filter.locale != null) {
						append("/language/")
						append(filter.locale.toLanguagePath())
						append("/?")
					} else {
						append("/?")
					}
				}

				null -> append("/?")
			}
			append("page=")
			append(page)

		}
		return parseMangaList(webClient.httpGet(url).parseHtml())
	}

	override suspend fun getAvailableLocales(): Set<Locale> = setOf(
		Locale.ENGLISH,
		Locale.FRENCH,
		Locale.JAPANESE,
		Locale.CHINESE,
		Locale("es"),
		Locale("ru"),
		Locale("ko"),
		Locale.GERMAN,
		Locale("pt"),
	)
}
