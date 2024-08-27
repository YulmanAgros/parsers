package org.xmanga.soft.parsers.site.wpcomics.vi

import androidx.collection.ArrayMap
import kotlinx.coroutines.sync.withLock
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.exception.NotFoundException
import org.xmanga.soft.parsers.model.Manga
import org.xmanga.soft.parsers.model.MangaListFilter
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.model.MangaState
import org.xmanga.soft.parsers.model.MangaTag
import org.xmanga.soft.parsers.model.SortOrder
import org.xmanga.soft.parsers.site.wpcomics.WpComicsParser
import org.xmanga.soft.parsers.util.*
import java.util.EnumSet

@MangaSourceParser("NETTRUYENLL", "NetTruyenLL", "vi")
internal class NetTruyenLL(context: MangaLoaderContext) :
	WpComicsParser(context, MangaParserSource.NETTRUYENLL, "nettruyenll.com", 20) {

	override val isMultipleTagsSupported = true
	override val isTagsExclusionSupported = true
	override val listUrl = "/tim-kiem-nang-cao"
	override val availableStates: Set<MangaState> =
		EnumSet.of(MangaState.ONGOING, MangaState.FINISHED, MangaState.PAUSED, MangaState.ABANDONED)
	override val availableSortOrders: Set<SortOrder> = EnumSet.allOf(SortOrder::class.java)

	override suspend fun getListPage(page: Int, filter: MangaListFilter?): List<Manga> {
		val response =
			when (filter) {
				is MangaListFilter.Search -> {
					val url = buildString {
						append("https://")
						append(domain)
						append("/search")
						append('/')
						append(page.toString())
						append('/')
						append("?keyword=")
						append(filter.query.urlEncoded())
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

						append('/')
						append(page.toString())
						append('/')

						val tagQuery = filter.tags.joinToString(",") { it.key }
						append("?genres=")
						append(tagQuery)

						val tagQueryExclude = filter.tagsExclude.joinToString(",") { it.key }
						append("&notGenres=")
						append(tagQueryExclude)

						append("&sex=All")

						filter.states.oneOrThrowIfMany()?.let {
							append("&status=")
							append(
								when (it) {
									MangaState.ONGOING -> "on-going"
									MangaState.FINISHED -> "completed"
									MangaState.PAUSED -> "on-hold"
									MangaState.ABANDONED -> "canceled"
									else -> "-1"
								},
							)
						}

						append("&chapter_count=0")

						append("&sort=")
						append(
							when (filter.sortOrder) {
								SortOrder.UPDATED -> "latest-updated"
								SortOrder.POPULARITY -> "views"
								SortOrder.NEWEST -> "new"
								SortOrder.RATING -> "score"
								SortOrder.ALPHABETICAL -> "az"
								SortOrder.ALPHABETICAL_DESC -> "za"
							},
						)
					}

					webClient.httpGet(url)
				}

				null -> {
					val url = buildString {
						append("https://")
						append(domain)
						append(listUrl)
						append('/')
						append(page.toString())
						append('/')
						append("?genres=&notGenres=&sex=All&status=&chapter_count=0&sort=latest-updated")
					}
					webClient.httpGet(url)
				}
			}

		val tagMap = getOrCreateTagMap()
		return parseMangaList(response.parseHtml(), tagMap)
	}

	override suspend fun getOrCreateTagMap(): ArrayMap<String, MangaTag> = mutex.withLock {
		tagCache?.let { return@withLock it }
		val doc = webClient.httpGet(listUrl.toAbsoluteUrl(domain)).parseHtml()
		val tagItems = doc.select("div.genre-item")
		val result = ArrayMap<String, MangaTag>(tagItems.size)
		for (item in tagItems) {
			val title = item.text()
			val key = item.selectFirstOrThrow("span").attr("data-id")
			if (key.isNotEmpty() && title.isNotEmpty()) {
				result[title] = MangaTag(title = title, key = key, source = source)
			}
		}
		tagCache = result
		result
	}
}
