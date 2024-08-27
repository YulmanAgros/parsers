package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAGG", "MangaGg", "en")
internal class Mangagg(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAGG, "mangagg.com") {
	override val tagPrefix = "genre/"
	override val datePattern = "MM/dd/yyyy"
}
