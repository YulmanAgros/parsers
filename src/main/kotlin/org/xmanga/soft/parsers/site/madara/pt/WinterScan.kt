package org.xmanga.soft.parsers.site.madara.pt

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("WINTERSCAN", "WinterScan", "pt")
internal class WinterScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.WINTERSCAN, "winterscan.com", pageSize = 20) {
	override val datePattern: String = "dd 'de' MMMMM 'de' yyyy"
}
