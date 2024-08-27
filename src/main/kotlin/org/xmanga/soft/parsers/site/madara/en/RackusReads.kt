package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("RACKUSREADS", "RackusReads", "en")
internal class RackusReads(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.RACKUSREADS, "rackusreads.com", 20) {
	override val datePattern = "MM/dd/yyyy"
}
