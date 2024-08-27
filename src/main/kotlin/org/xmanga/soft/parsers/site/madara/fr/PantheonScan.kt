package org.xmanga.soft.parsers.site.madara.fr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("PANTHEONSCAN", "PantheonScan.com", "fr")
internal class PantheonScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.PANTHEONSCAN, "pantheon-scan.com") {
	override val datePattern = "d MMMM yyyy"
}
