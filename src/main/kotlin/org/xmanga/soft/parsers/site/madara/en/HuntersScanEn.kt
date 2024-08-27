package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("HUNTERSSCANEN", "EnHuntersScan", "en")
internal class HuntersScanEn(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.HUNTERSSCANEN, "en.huntersscan.xyz") {
	override val withoutAjax = true
	override val datePattern = "MM/dd/yyyy"
	override val tagPrefix = "series-genre/"
	override val listUrl = "manga/"
}
