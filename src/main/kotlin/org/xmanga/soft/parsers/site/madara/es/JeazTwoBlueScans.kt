package org.xmanga.soft.parsers.site.madara.es

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("JEAZTWOBLUESCANS", "Marcialhub", "es")
internal class JeazTwoBlueScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.JEAZTWOBLUESCANS, "marcialhub.xyz") {
	override val datePattern = "d MMMM, yyyy"
}
