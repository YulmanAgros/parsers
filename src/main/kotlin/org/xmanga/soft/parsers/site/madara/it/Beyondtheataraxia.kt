package org.xmanga.soft.parsers.site.madara.it

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("BEYONDTHEATARAXIA", "Beyond The Ataraxia", "it")
internal class Beyondtheataraxia(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.BEYONDTHEATARAXIA, "www.beyondtheataraxia.com", 10) {
	override val datePattern = "d MMMM yyyy"
}
