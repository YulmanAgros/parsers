package org.xmanga.soft.parsers.site.madara.pt

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("NEROXUS", "Neroxus", "pt")
internal class Neroxus(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.NEROXUS, "neroxus.com.br", 10) {
	override val datePattern = "MMM d, yyyy"
}
