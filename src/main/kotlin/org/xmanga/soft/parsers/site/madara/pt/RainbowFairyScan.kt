package org.xmanga.soft.parsers.site.madara.pt

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("RAINBOWFAIRYSCAN", "RainbowFairyScan", "pt")
internal class RainbowFairyScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.RAINBOWFAIRYSCAN, "rainbowfairyscan.com", 10) {
	override val datePattern: String = "dd/MM/yyyy"
}
