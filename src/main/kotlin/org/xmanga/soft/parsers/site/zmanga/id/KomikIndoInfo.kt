package org.xmanga.soft.parsers.site.zmanga.id

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.zmanga.ZMangaParser

@MangaSourceParser("KOMIKINDO_INFO", "KomikIndo.info", "id", ContentType.HENTAI)
internal class KomikIndoInfo(context: MangaLoaderContext) :
	ZMangaParser(context, MangaParserSource.KOMIKINDO_INFO, "komikindo.info") {
	override val datePattern = "dd MMM yyyy"
}
