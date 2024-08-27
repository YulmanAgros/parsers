package org.xmanga.soft.parsers.site.madara.pt

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("VALKYRIESCAN", "ValkyrieScan", "pt", ContentType.HENTAI)
internal class ValkyrieScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.VALKYRIESCAN, "valkyriescan.com", pageSize = 10) {
	override val datePattern: String = "dd/MM/yyyy"
}
