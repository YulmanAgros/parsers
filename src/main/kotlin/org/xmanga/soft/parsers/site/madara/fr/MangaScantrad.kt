package org.xmanga.soft.parsers.site.madara.fr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGA_SCANTRAD", "MangaScantrad.io", "fr")
internal class MangaScantrad(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGA_SCANTRAD, "manga-scantrad.io") {
	override val datePattern = "d MMMM yyyy"
}
