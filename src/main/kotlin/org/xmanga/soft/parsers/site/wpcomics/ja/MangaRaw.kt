package org.xmanga.soft.parsers.site.wpcomics.ja

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.exception.NotFoundException
import org.xmanga.soft.parsers.model.Manga
import org.xmanga.soft.parsers.model.MangaListFilter
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.model.MangaState
import org.xmanga.soft.parsers.model.SortOrder
import org.xmanga.soft.parsers.site.wpcomics.WpComicsParser
import org.xmanga.soft.parsers.util.domain
import org.xmanga.soft.parsers.util.oneOrThrowIfMany
import org.xmanga.soft.parsers.util.parseHtml
import org.xmanga.soft.parsers.util.runCatchingCancellable
import org.xmanga.soft.parsers.util.urlEncoded

// Need to use 0ms.dev Proxy

@MangaSourceParser("MANGARAW", "MangaRaw", "ja")
internal class MangaRaw(context: MangaLoaderContext) :
	WpComicsParser(context, MangaParserSource.MANGARAW, "mangaraw.xyz") {
	override val listUrl = "/search/manga"

	override suspend fun getListPage(page: Int, filter: MangaListFilter?): List<Manga> {
		val response =
			when (filter) {
				is MangaListFilter.Search -> {
					val url = buildString {
						append("https://")
						append(domain)
						append(listUrl)
						append("?keyword=")
						append(filter.query.urlEncoded())
						append("&page=")
						append(page.toString())
					}

					val result = runCatchingCancellable { webClient.httpGet(url) }
					val exception = result.exceptionOrNull()
					if (exception is NotFoundException) {
						return emptyList()
					}
					result.getOrThrow()
				}

				is MangaListFilter.Advanced -> {
					val url = buildString {
						append("https://")
						append(domain)
						append(listUrl)
						append("?sort=")
						append(
							when (filter.sortOrder) {
								SortOrder.UPDATED -> 0
								SortOrder.POPULARITY -> 10
								SortOrder.NEWEST -> 15
								SortOrder.RATING -> 20
								else -> throw IllegalArgumentException("Sort order ${filter.sortOrder.name} not supported")
							},
						)
						if (filter.tags.isNotEmpty()) {
							append("&genre=")
							filter.tags.oneOrThrowIfMany()?.let {
								append(it.key)
							}
						}
						filter.states.oneOrThrowIfMany()?.let {
							append("&status=")
							append(
								when (it) {
									MangaState.ONGOING -> "1"
									MangaState.FINISHED -> "2"
									else -> "-1"
								},
							)
						}
						append("&page=")
						append(page.toString())
					}

					webClient.httpGet(url)
				}

				null -> {
					val url = buildString {
						append("https://")
						append(domain)
						append(listUrl)
						append("?genres=&notgenres=&gender=-1&status=-1&minchapter=1&sort=0&page=")
						append(page.toString())
					}
					webClient.httpGet(url)
				}
			}
		val tagMap = getOrCreateTagMap()
		return parseMangaList(response.parseHtml(), tagMap)
	}
}
