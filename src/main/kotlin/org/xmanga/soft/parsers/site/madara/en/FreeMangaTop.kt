package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("FREEMANGATOP", "FreeMangaTop", "en")
internal class FreeMangaTop(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.FREEMANGATOP, "freemangatop.com") {
	override val datePattern = "MM/dd/yyyy"
}
