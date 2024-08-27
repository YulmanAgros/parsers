package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("MANHWACLAN", "ManhwaClan", "en")
internal class ManhwaClan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANHWACLAN, "manhwaclan.com", pageSize = 10) {
	override val datePattern = "MMMM dd, yyyy"
}
