package org.xmanga.soft.parsers.site.mangareader.es

import org.json.JSONObject
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.Manga
import org.xmanga.soft.parsers.model.MangaChapter
import org.xmanga.soft.parsers.model.MangaListFilter
import org.xmanga.soft.parsers.model.MangaPage
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.model.MangaState
import org.xmanga.soft.parsers.model.SortOrder
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser
import org.xmanga.soft.parsers.util.domain
import org.xmanga.soft.parsers.util.generateUid
import org.xmanga.soft.parsers.util.oneOrThrowIfMany
import org.xmanga.soft.parsers.util.parseHtml
import org.xmanga.soft.parsers.util.selectFirstOrThrow
import org.xmanga.soft.parsers.util.toAbsoluteUrl
import org.xmanga.soft.parsers.util.urlEncoded
import java.util.ArrayList

@MangaSourceParser("MANGATV", "MangaTv", "es")
internal class MangaTv(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MANGATV, "www.mangatv.net", pageSize = 25, searchPageSize = 25) {
	override val listUrl = "/lista"
	override val isTagsExclusionSupported = false
	override val datePattern = "yyyy-MM-dd"

	override suspend fun getListPage(page: Int, filter: MangaListFilter?): List<Manga> {
		val url = buildString {
			append("https://")
			append(domain)

			when (filter) {

				is MangaListFilter.Search -> {
					append("/lista?s=")
					append(filter.query.urlEncoded())
					append("&page=")
					append(page.toString())
				}

				is MangaListFilter.Advanced -> {
					append(listUrl)

					append("/?order=")
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

	override suspend fun getPages(chapter: MangaChapter): List<MangaPage> {
		val chapterUrl = chapter.url.toAbsoluteUrl(domain)
		val docs = webClient.httpGet(chapterUrl).parseHtml()
		val script = docs.selectFirstOrThrow(selectTestScript)
		val images = JSONObject(script.data().substringAfter('(').substringBeforeLast(')').replace(", ] }]", " ] }]"))
			.getJSONArray("sources")
			.getJSONObject(0)
			.getJSONArray("images")
		val pages = ArrayList<MangaPage>(images.length())
		for (i in 0 until images.length()) {
			pages.add(
				MangaPage(
					id = generateUid(images.getString(i)),
					url = images.getString(i),
					preview = null,
					source = source,
				),
			)
		}
		return pages
	}
}
