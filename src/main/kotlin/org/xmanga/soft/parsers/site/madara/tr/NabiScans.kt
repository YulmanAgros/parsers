package org.xmanga.soft.parsers.site.madara.tr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("NABISCANS", "NabiScans", "tr")
internal class NabiScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.NABISCANS, "nabiscans.com") {
	override val datePattern = "d MMMM yyyy"
}
