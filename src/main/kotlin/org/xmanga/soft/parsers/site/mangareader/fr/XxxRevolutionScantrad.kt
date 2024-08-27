package org.xmanga.soft.parsers.site.mangareader.fr

import org.jsoup.nodes.Document
import org.xmanga.soft.parsers.ErrorMessages
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.Manga
import org.xmanga.soft.parsers.model.MangaChapter
import org.xmanga.soft.parsers.model.MangaListFilter
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.model.MangaState
import org.xmanga.soft.parsers.model.RATING_UNKNOWN
import org.xmanga.soft.parsers.model.SortOrder
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser
import org.xmanga.soft.parsers.util.attrAsAbsoluteUrl
import org.xmanga.soft.parsers.util.attrAsRelativeUrl
import org.xmanga.soft.parsers.util.domain
import org.xmanga.soft.parsers.util.generateUid
import org.xmanga.soft.parsers.util.mapChapters
import org.xmanga.soft.parsers.util.oneOrThrowIfMany
import org.xmanga.soft.parsers.util.parseHtml
import org.xmanga.soft.parsers.util.src
import org.xmanga.soft.parsers.util.toAbsoluteUrl
import org.xmanga.soft.parsers.util.tryParse
import org.xmanga.soft.parsers.util.urlEncoded
import java.text.SimpleDateFormat

@MangaSourceParser("XXXREVOLUTIONSCANTRAD", "Xxx.RevolutionScantrad", "fr", ContentType.HENTAI)
internal class XxxRevolutionScantrad(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.XXXREVOLUTIONSCANTRAD,
		"xxx.revolutionscantrad.com",
		pageSize = 100,
		searchPageSize = 10,
	) {
	override val listUrl = "/series.html"
	override val datePattern = "yyyy"
	override val isTagsExclusionSupported = false
	override val isSearchSupported = false

	override suspend fun getListPage(page: Int, filter: MangaListFilter?): List<Manga> {
		if (page > 1) {
			return emptyList()
		}
		val url = buildString {
			append("https://")
			append(domain)

			when (filter) {

				is MangaListFilter.Search -> {
					throw IllegalArgumentException(ErrorMessages.SEARCH_NOT_SUPPORTED)
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

					filter.tagsExclude.forEach {
						append("&")
						append("genre[]".urlEncoded())
						append("=-")
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

	override val selectPage = "div#readerarea img.chapter-image"

	override fun parseMangaList(docs: Document): List<Manga> {
		return docs.select(selectMangaList).mapNotNull {
			val a = it.selectFirst("a") ?: return@mapNotNull null
			val relativeUrl = "/" + a.attrAsRelativeUrl("href")
			val rating = it.selectFirst(".numscore")?.text()
				?.toFloatOrNull()?.div(10) ?: RATING_UNKNOWN
			Manga(
				id = generateUid(relativeUrl),
				url = relativeUrl,
				title = it.selectFirst(selectMangaListTitle)?.text() ?: a.attr("title"),
				altTitle = null,
				publicUrl = a.attrAsAbsoluteUrl("href"),
				rating = rating,
				isNsfw = isNsfwSource,
				coverUrl = it.selectFirst(selectMangaListImg)?.src().orEmpty(),
				tags = emptySet(),
				state = null,
				author = null,
				source = source,
			)
		}
	}

	override suspend fun getDetails(manga: Manga): Manga {
		val docs = webClient.httpGet(manga.url.toAbsoluteUrl(domain)).parseHtml()
		val dateFormat = SimpleDateFormat(datePattern, sourceLocale)
		val urlStart = manga.url.substringBeforeLast('/')
		val chapters = docs.select(selectChapter).mapChapters(reversed = true) { index, element ->
			val url = element.selectFirst("a")?.attrAsRelativeUrl("href") ?: return@mapChapters null
			MangaChapter(
				id = generateUid(url),
				name = element.selectFirst(".chapternum")?.text() ?: "Chapter ${index + 1}",
				url = "$urlStart/$url",
				number = index + 1f,
				volume = 0,
				scanlator = null,
				uploadDate = dateFormat.tryParse(element.selectFirst(".chapterdate")?.text()),
				branch = null,
				source = source,
			)
		}
		return parseInfo(docs, manga, chapters)
	}


}
