package org.xmanga.soft.parsers.site.madara.tr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("KORELISCANS", "KoreliScans", "tr")
internal class KoreliScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.KORELISCANS, "koreliscans.com", 10) {
	override val datePattern = "d MMMM"
}
