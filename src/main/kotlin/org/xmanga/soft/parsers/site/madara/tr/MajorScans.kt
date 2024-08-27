package org.xmanga.soft.parsers.site.madara.tr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("MAJORSCANS", "MajorScans", "tr")
internal class MajorScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MAJORSCANS, "www.majorscans.com", pageSize = 18) {
	override val datePattern = "dd/MM/yyyy"
}
