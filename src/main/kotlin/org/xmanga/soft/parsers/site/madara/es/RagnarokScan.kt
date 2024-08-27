package org.xmanga.soft.parsers.site.madara.es

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("RAGNAROKSCAN", "RagnarokScan", "es")
internal class RagnarokScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.RAGNAROKSCAN, "ragnarokscan.com") {
	override val stylePage = ""
	override val listUrl = "series/"
	override val tagPrefix = "genero/"
}
