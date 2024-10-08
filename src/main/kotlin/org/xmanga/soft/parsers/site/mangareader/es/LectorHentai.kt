package org.xmanga.soft.parsers.site.mangareader.es

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.Manga
import org.xmanga.soft.parsers.model.MangaChapter
import org.xmanga.soft.parsers.model.MangaListFilter
import org.xmanga.soft.parsers.model.MangaPage
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.model.MangaState
import org.xmanga.soft.parsers.model.SortOrder
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser
import org.xmanga.soft.parsers.util.*
import java.text.SimpleDateFormat

@MangaSourceParser("LECTORHENTAI", "LectorHentai", "es", ContentType.HENTAI)
internal class LectorHentai(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.LECTORHENTAI, "lectorhentai.com", pageSize = 25, searchPageSize = 25) {
	override val listUrl = "/tipo/all"
	override val isTagsExclusionSupported = false

	override suspend fun getListPage(page: Int, filter: MangaListFilter?): List<Manga> {
		val url = buildString {
			append("https://")
			append(domain)

			when (filter) {

				is MangaListFilter.Search -> {
					append(listUrl)
					append("?s=")
					append(filter.query.urlEncoded())
					append("&page=")
					append(page.toString())
				}

				is MangaListFilter.Advanced -> {
					append(listUrl)
					append("?order=")
					append(
						when (filter.sortOrder) {
							SortOrder.ALPHABETICAL -> "title"
							SortOrder.ALPHABETICAL_DESC -> "titlereverse"
							SortOrder.NEWEST -> "latest"
							SortOrder.POPULARITY -> "popular"
							SortOrder.UPDATED -> "update"
							else -> ""
						},
					)

					filter.tags.forEach {
						append("&")
						append("genre[]".urlEncoded())
						append("=")
						append(it.key)
					}

					if (filter.states.isNotEmpty()) {
						filter.states.oneOrThrowIfMany()?.let {
							append("&status=")
							when (it) {
								MangaState.ONGOING -> append("ongoing")
								MangaState.FINISHED -> append("completed")
								MangaState.PAUSED -> append("hiatus")
								else -> append("")
							}
						}
					}

					append("&page=")
					append(page.toString())
				}

				null -> {
					append(listUrl)
					append("/?order=update&page=")
					append(page.toString())
				}
			}
		}
		return parseMangaList(webClient.httpGet(url).parseHtml())
	}

	override val selectChapter = ".releases"
	override suspend fun getDetails(manga: Manga): Manga {
		val docs = webClient.httpGet(manga.url.toAbsoluteUrl(domain)).parseHtml()
		val dateFormat = SimpleDateFormat(datePattern, sourceLocale)
		val chapters = docs.select(selectChapter).mapChapters(reversed = true) { index, element ->
			val url = element.selectFirst("a")?.attrAsRelativeUrl("href") ?: return@mapChapters null
			MangaChapter(
				id = generateUid(url),
				name = element.selectFirst("h2")?.text() ?: "Chapter ${index + 1}",
				url = url,
				number = index + 1f,
				volume = 0,
				scanlator = null,
				uploadDate = dateFormat.tryParse(docs.selectFirst("time")?.text()),
				branch = null,
				source = source,
			)
		}
		return parseInfo(docs, manga, chapters)
	}

	override suspend fun getPages(chapter: MangaChapter): List<MangaPage> {
		val chapterUrl = chapter.url.toAbsoluteUrl(domain)
		val docs = webClient.httpGet(chapterUrl).parseHtml()
		val script = docs.selectFirstOrThrow(selectTestScript).data()
		val images = script.substringAfterLast("\"images\": [").substringBefore("]")
			.replace(" ", "").replace("\"", "").replace("\n", "").split(",").dropLast(1)
		return images.map { img ->
			val url = "https://" + img.substringAfter("//")
			MangaPage(
				id = generateUid(url),
				url = url,
				preview = null,
				source = source,
			)
		}
	}

}
