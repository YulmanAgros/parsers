package org.xmanga.soft.parsers.site.madara.ar

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("ASQORG", "3Asq", "ar")
internal class Asq(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ASQORG, "3asq.org") {
	override val datePattern = "d MMMM، yyyy"
}
