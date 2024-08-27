package org.xmanga.soft.parsers.site.madara.es

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("COCORIP", "Cocorip", "es")
internal class Cocorip(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.COCORIP, "cocorip.net", 16) {
	override val datePattern = "dd/MM/yyyy"
}
