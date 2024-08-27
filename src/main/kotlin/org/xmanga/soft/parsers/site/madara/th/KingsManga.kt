package org.xmanga.soft.parsers.site.madara.th

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("KINGS_MANGA", "KingsManga", "th")
internal class KingsManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.KINGS_MANGA, "www.kings-manga.co") {
	override val postReq = true
	override val datePattern = "d MMMM yyyy"
}
