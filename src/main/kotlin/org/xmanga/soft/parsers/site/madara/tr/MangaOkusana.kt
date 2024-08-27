package org.xmanga.soft.parsers.site.madara.tr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAOKUSANA", "MangaOkusana", "tr")
internal class MangaOkusana(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAOKUSANA, "mangaokusana.com") {
	override val datePattern = "dd MMMM yyyy"
}
