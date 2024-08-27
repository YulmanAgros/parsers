package org.xmanga.soft.parsers.site.madara.tr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("ARAZNOVEL", "ArazNovel", "tr")
internal class ArazNovel(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ARAZNOVEL, "araznovel.com", 10) {
	override val datePattern = "d MMMM yyyy"
	override val postReq = true
}
