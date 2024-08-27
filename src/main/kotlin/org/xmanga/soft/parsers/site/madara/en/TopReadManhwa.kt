package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("TOPREADMANHWA", "TopReadManhwa", "en")
internal class TopReadManhwa(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.TOPREADMANHWA, "topreadmanhwa.com") {
	override val datePattern = "MM/dd/yyyy"
}
