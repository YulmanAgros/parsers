package org.xmanga.soft.parsers.site.mangareader.th

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("ECCHIDOUJIN", "EcchiDoujin", "th", ContentType.HENTAI)
internal class EcchiDoujin(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.ECCHIDOUJIN, "ecchi-doujin.com", pageSize = 30, searchPageSize = 10) {
	override val listUrl = "/doujin"
	override val isTagsExclusionSupported = false
}
