package org.xmanga.soft.parsers.site.zeistmanga.pt

import org.jsoup.nodes.Document
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaChapter
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.model.MangaTag
import org.xmanga.soft.parsers.site.zeistmanga.ZeistMangaParser
import org.xmanga.soft.parsers.util.*

@MangaSourceParser("ANIMEXNOVEL", "AnimeXNovel", "pt")
internal class AnimeXNovel(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.ANIMEXNOVEL, "www.animexnovel.com") {

	override val sateOngoing: String = "Ativo"
	override val sateFinished: String = "Completo"
	override val sateAbandoned: String = "Dropado"

	override suspend fun getAvailableTags(): Set<MangaTag> {
		val doc = webClient.httpGet("https://$domain").parseHtml()
		return doc.requireElementById("LinkList1").select("ul li a").mapNotNullToSet {
			MangaTag(
				key = it.attr("href").removeSuffix("/").substringAfterLast('/'),
				title = it.text(),
				source = source,
			)
		}
	}

	override suspend fun loadChapters(mangaUrl: String, doc: Document): List<MangaChapter> {
		return doc.select("div:has(> .list-judul:contains(Lista de Capítulos)) div#latest ul > li, div.tab:has(> label:contains(Lista de Capítulos)) div.tab-content ul > li")
			.mapChapters(reversed = true) { i, li ->
				val url = li.selectFirstOrThrow("a").attr("href")
				val name = li.selectFirstOrThrow("a span").text()
				MangaChapter(
					id = generateUid(url),
					url = url,
					name = name,
					number = i + 1f,
					volume = 0,
					branch = null,
					uploadDate = 0,
					scanlator = null,
					source = source,
				)
			}
	}
}
