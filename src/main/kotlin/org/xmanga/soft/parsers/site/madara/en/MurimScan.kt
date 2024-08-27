package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("MURIMSCAN", "InkReads", "en")
internal class MurimScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MURIMSCAN, "inkreads.com", 100) {
	override val withoutAjax = true
	override val postReq = true
	override val listUrl = "mangax/"
}
