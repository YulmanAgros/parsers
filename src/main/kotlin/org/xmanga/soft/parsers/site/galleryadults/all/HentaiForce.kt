package org.xmanga.soft.parsers.site.galleryadults.all

import org.jsoup.internal.StringUtil
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.*
import org.xmanga.soft.parsers.site.galleryadults.GalleryAdultsParser
import org.xmanga.soft.parsers.util.*
import java.util.*

@MangaSourceParser("HENTAIFORCE", "HentaiForce", type = ContentType.HENTAI)
internal class HentaiForce(context: MangaLoaderContext) :
	GalleryAdultsParser(context, MangaParserSource.HENTAIFORCE, "hentaiforce.net", pageSize = 30) {
	override val selectGallery = ".gallery"
	override val selectGalleryLink = "a.gallery-thumb"
	override val pathTagUrl = "/tags/popular/"
	override val selectTags = ".tag-listing"
	override val selectUrlChapter = "#gallery-main-cover a"
	override val selectTag = "div.tag-container:contains(Tags:)"
	override val selectAuthor = "div.tag-container:contains(Artists:) a"
	override val selectLanguageChapter = "div.tag-container:contains(Languages:) a"
	override val idImg = ".gallery-reader-img-wrapper img"

	override val isMultipleTagsSupported = true

	override val availableSortOrders: Set<SortOrder> = EnumSet.of(SortOrder.UPDATED, SortOrder.POPULARITY)

	override suspend fun getAvailableLocales(): Set<Locale> = setOf(
		Locale.ENGLISH,
		Locale.FRENCH,
		Locale.JAPANESE,
		Locale.CHINESE,
		Locale("es"),
		Locale("ru"),
		Locale("ko"),
		Locale.GERMAN,
		Locale("id"),
		Locale.ITALIAN,
		Locale("pt"),
		Locale("th"),
		Locale("vi"),
	)

	override suspend fun getPageUrl(page: MangaPage): String {
		val doc = webClient.httpGet(page.url.toAbsoluteUrl(domain)).parseHtml()
		return doc.selectFirstOrThrow(idImg).src() ?: doc.parseFailed("Image src not found")
	}

	override suspend fun getListPage(page: Int, filter: MangaListFilter?): List<Manga> {
		val url = buildString {
			append("https://")
			append(domain)
			when (filter) {
				is MangaListFilter.Search -> {
					append("/search?q=")
					append(filter.query.urlEncoded())
					append("&page=")
				}

				is MangaListFilter.Advanced -> {
					if (filter.tags.size > 1 || (filter.tags.isNotEmpty() && filter.locale != null)) {
						append("/search?q=")
						append(buildQuery(filter.tags, filter.locale))
						if (filter.sortOrder == SortOrder.POPULARITY) {
							append("&sort=popular")
						}
						append("&page=")
					} else if (filter.tags.isNotEmpty()) {
						filter.tags.oneOrThrowIfMany()?.let {
							append("/tag/")
							append(it.key)
						}
						append("/")

						if (filter.sortOrder == SortOrder.POPULARITY) {
							append("popular/")
						}
						append("?")
					} else if (filter.locale != null) {
						append("/language/")
						append(filter.locale.toLanguagePath())
						append("/")

						if (filter.sortOrder == SortOrder.POPULARITY) {
							append("popular/")
						}
						append("?")
					} else {
						append("/page/")
					}
				}

				null -> append("/page/")
			}
			append(page.toString())
		}

		return parseMangaList(webClient.httpGet(url).parseHtml())
	}

	private fun buildQuery(tags: Collection<MangaTag>, language: Locale?): String {
		val joiner = StringUtil.StringJoiner(" ")
		tags.forEach { tag ->
			joiner.add("tag:\"")
			joiner.append(tag.key)
			joiner.append("\"")
		}
		language?.let { lc ->
			joiner.add("language:\"")
			joiner.append(lc.toLanguagePath())
			joiner.append("\"")
		}
		return joiner.complete()
	}
}
