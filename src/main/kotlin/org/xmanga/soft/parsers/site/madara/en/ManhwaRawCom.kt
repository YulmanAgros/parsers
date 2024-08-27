package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("MANHWARAW_COM", "ManhwaRaw.com", "en", ContentType.HENTAI)
internal class ManhwaRawCom(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANHWARAW_COM, "manhwaraw.com") {
	override val postReq = true
	override val listUrl = "manhwa-raw/"
	override val tagPrefix = "manhwa-raw-genre/"
}
