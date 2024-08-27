package org.xmanga.soft.parsers.site.galleryadults.all

import org.jsoup.internal.StringUtil
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.*
import org.xmanga.soft.parsers.site.galleryadults.GalleryAdultsParser
import org.xmanga.soft.parsers.util.*
import java.util.*

@MangaSourceParser("HENTAI3", "3Hentai", type = ContentType.HENTAI)
internal class Hentai3(context: MangaLoaderContext) :
	GalleryAdultsParser(context, MangaParserSource.HENTAI3, "3hentai.net", pageSize = 30) {

	override val selectGallery = ".doujin "
	override val selectGalleryLink = "a"
	override val selectGalleryTitle = ".title"
	override val pathTagUrl = "/tags-popular/"
	override val selectTags = "div.tag-listing-container"
	override val selectTag = "div.tag-container:contains(Tags)"
	override val selectAuthor = "div.tag-container:contains(Artists) .filter-elem a"
	override val selectLanguageChapter = "div.tag-container:contains(Languages) a"
	override val selectUrlChapter = "#main-cover a"
	override val idImg = ".js-main-img"

	override val isMultipleTagsSupported = true

	override val availableSortOrders: Set<SortOrder> = EnumSet.of(SortOrder.UPDATED, SortOrder.POPULARITY)

	override suspend fun getAvailableLocales(): Set<Locale> = setOf(
		Locale.ENGLISH,
		Locale.FRENCH,
		Locale.JAPANESE,
		Locale("es"),
		Locale("ru"),
		Locale.ITALIAN,
		Locale("pt"),
	)

	override suspend fun getListPage(page: Int, filter: MangaListFilter?): List<Manga> {
		val url = buildString {
			append("https://")
			append(domain)
			when (filter) {

				is MangaListFilter.Search -> {
					append("/search?q=")
					append(filter.query.urlEncoded())
					append("&page=")
					append(page.toString())
				}

				is MangaListFilter.Advanced -> {
					if (filter.tags.size > 1 || (filter.tags.isNotEmpty() && filter.locale != null)) {
						append("/search?q=")
						append(buildQuery(filter.tags, filter.locale))
						if (filter.sortOrder == SortOrder.POPULARITY) {
							append("&sort=popular")
						}
						append("&page=")
						append(page.toString())
					} else if (filter.locale != null) {
						append("/language/")
						append(filter.locale.toLanguagePath())
						append("/")
						append(page.toString())
						if (filter.sortOrder == SortOrder.POPULARITY) {
							append("?sort=popular")
						}
					} else if (filter.tags.isNotEmpty()) {
						filter.tags.oneOrThrowIfMany()?.let {
							append("/tags/")
							append(it.key)
						}
						append("/")
						append(page.toString())
						if (filter.sortOrder == SortOrder.POPULARITY) {
							append("?sort=popular")
						}
					} else {
						append("/")
						append(page)
					}
				}

				null -> {
					append("/")
					append(page)
				}
			}
		}
		return parseMangaList(webClient.httpGet(url).parseHtml())
	}

	override suspend fun getPageUrl(page: MangaPage): String {
		val doc = webClient.httpGet(page.url.toAbsoluteUrl(domain)).parseHtml()
		return doc.selectFirstOrThrow(idImg).src() ?: doc.parseFailed("Image src not found")
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
