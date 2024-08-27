package org.xmanga.soft.parsers.site.madara.fr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("RAIJINSCANS", "RaijinScans", "fr")
internal class RaijinScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.RAIJINSCANS, "raijinscans.fr") {
	override val datePattern = "dd/MM/yyyy"
}
