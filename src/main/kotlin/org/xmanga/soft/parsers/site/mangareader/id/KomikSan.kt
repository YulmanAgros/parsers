package org.xmanga.soft.parsers.site.mangareader.id

import org.xmanga.soft.parsers.Broken
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.*
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser
import org.xmanga.soft.parsers.util.domain
import org.xmanga.soft.parsers.util.oneOrThrowIfMany
import org.xmanga.soft.parsers.util.parseHtml
import org.xmanga.soft.parsers.util.urlEncoded

@Broken
@MangaSourceParser("KOMIKSAN", "KomikSan", "id")
internal class KomikSan(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.KOMIKSAN, "komiksan.link", pageSize = 40, searchPageSize = 10) {

	override val selectMangaListImg = "img.attachment-medium"
	override val listUrl = "/list"
	override val datePattern = "MMM d, yyyy"
	override val isTagsExclusionSupported = false

	override suspend fun getListPage(page: Int, filter: MangaListFilter?): List<Manga> {
		val url = buildString {
			append("https://")
			append(domain)
			when (filter) {

				is MangaListFilter.Search -> {
					append("/search?search=")
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

					val tagKey = "genre[]".urlEncoded()
					val tagQuery =
						if (filter.tags.isEmpty()) ""
						else filter.tags.joinToString(separator = "&", prefix = "&") { "$tagKey=${it.key}" }
					append(tagQuery)

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
}
