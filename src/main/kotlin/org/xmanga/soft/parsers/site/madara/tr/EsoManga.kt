package org.xmanga.soft.parsers.site.madara.tr

import org.xmanga.soft.parsers.Broken
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("ESOMANGA", "EsoManga", "tr")
internal class EsoManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ESOMANGA, "esomanga.com", 10) {
	override val postReq = true
	override val datePattern = "dd/MM/yyyy"
	override val tagPrefix = "manga-kategoriler/"
}
