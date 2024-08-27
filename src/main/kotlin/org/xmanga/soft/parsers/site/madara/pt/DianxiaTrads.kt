package org.xmanga.soft.parsers.site.madara.pt

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("DIANXIATRADS", "DianxiaTrads", "pt")
internal class DianxiaTrads(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.DIANXIATRADS, "dianxiatrads.com", 10) {
	override val datePattern: String = "dd/MM/yyyy"
}
