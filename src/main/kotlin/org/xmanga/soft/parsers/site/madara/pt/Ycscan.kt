package org.xmanga.soft.parsers.site.madara.pt

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("YCSCAN", "YcScan", "pt", ContentType.HENTAI)
internal class Ycscan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.YCSCAN, "ycscan.com", 20) {
	override val datePattern: String = "dd/MM/yyyy"
}
