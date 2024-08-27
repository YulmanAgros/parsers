package org.xmanga.soft.parsers.site.mangareader.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.*
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser
import org.xmanga.soft.parsers.util.domain
import org.xmanga.soft.parsers.util.oneOrThrowIfMany
import org.xmanga.soft.parsers.util.parseHtml
import org.xmanga.soft.parsers.util.urlEncoded
import java.util.*

@MangaSourceParser("ZAHARD", "Zahard", "en")
internal class Zahard(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.ZAHARD, "zahard.xyz", pageSize = 20, searchPageSize = 30) {

	override val listUrl = "/library"
	override val selectChapter = "#chapterlist > ul > a"
	override val selectPage = "div#chapter_imgs img"
	override val availableSortOrders: Set<SortOrder> = EnumSet.of(SortOrder.NEWEST)
	override val availableStates: Set<MangaState> = emptySet()
	override val isMultipleTagsSupported = false
	override val isTagsExclusionSupported = false

	override suspend fun getListPage(page: Int, filter: MangaListFilter?): List<Manga> {
		val url = buildString {
			append("https://")
			append(domain)
			append(listUrl)
			append("?page=")
			append(page.toString())
			when (filter) {

				is MangaListFilter.Search -> {
					append("&search=")
					append(filter.query.urlEncoded())
				}

				is MangaListFilter.Advanced -> {
					filter.tags.oneOrThrowIfMany()?.let {
						append("tag=")
						append(it.key)
					}
				}

				null -> {}
			}
		}
		return parseMangaList(webClient.httpGet(url).parseHtml())
	}
}
