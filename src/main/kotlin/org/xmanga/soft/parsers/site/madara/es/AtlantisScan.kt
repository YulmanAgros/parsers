package org.xmanga.soft.parsers.site.madara.es

import org.xmanga.soft.parsers.Broken
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("ATLANTISSCAN", "AtlantisScan", "es")
internal class AtlantisScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ATLANTISSCAN, "scansatlanticos.com", pageSize = 50) {
	override val datePattern = "dd/MM/yyyy"
}
