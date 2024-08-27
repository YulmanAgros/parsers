package org.xmanga.soft.parsers.site.madara.tr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("YAOITR", "YaoiTr", "tr")
internal class YaoiTr(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.YAOITR, "yaoitr.fun", 16) {
	override val datePattern = "d MMMM yyyy"
}
