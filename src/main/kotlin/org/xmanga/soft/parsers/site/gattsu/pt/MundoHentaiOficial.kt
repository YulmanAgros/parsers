package org.xmanga.soft.parsers.site.gattsu.pt

import org.jsoup.nodes.Document
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.Manga
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.model.RATING_UNKNOWN
import org.xmanga.soft.parsers.site.gattsu.GattsuParser
import org.xmanga.soft.parsers.util.*

@MangaSourceParser("MUNDOHENTAIOFICIAL", "MundoHentaiOficial", "pt", ContentType.HENTAI)
internal class MundoHentaiOficial(context: MangaLoaderContext) :
	GattsuParser(context, MangaParserSource.MUNDOHENTAIOFICIAL, "mundohentaioficial.com") {

	override val tagUrl = "tags"

	override fun parseMangaList(doc: Document): List<Manga> {
		return doc.select("div.lista ul li, div.videos div.video").mapNotNull { li ->
			val a = li.selectLastOrThrow("a")
			val href = a.attrAsAbsoluteUrl("href")
			if (!href.contains(domain)) {
				//Some sources include ads in manga lists
				return@mapNotNull null
			}
			Manga(
				id = generateUid(href),
				url = href,
				publicUrl = href,
				title = li.selectLastOrThrow(".thumb-titulo, .video-titulo").text(),
				coverUrl = li.selectFirst("img")?.src().orEmpty(),
				altTitle = null,
				rating = RATING_UNKNOWN,
				tags = emptySet(),
				description = null,
				state = null,
				author = null,
				isNsfw = isNsfwSource,
				source = source,
			)
		}
	}
}
