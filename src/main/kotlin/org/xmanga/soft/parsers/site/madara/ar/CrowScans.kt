package org.xmanga.soft.parsers.site.madara.ar

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("CROWSCANS", "Hadess", "ar")
internal class CrowScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.CROWSCANS, "www.hadess.xyz") {
	override val datePattern = "dd MMMM، yyyy"
}
