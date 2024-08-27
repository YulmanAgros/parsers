package org.xmanga.soft.parsers.site.madara.tr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("JIANGZAITOON", "JiangzaiToon", "tr", ContentType.HENTAI)
internal class Jiangzaitoon(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.JIANGZAITOON, "jiangzaitoon.pro") {
	override val datePattern = "d MMMM yyyy"
	override val postReq = true
}
