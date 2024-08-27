package org.xmanga.soft.parsers.site.madara.tr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("KEDI", "Kedi", "tr")
internal class Kedi(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.KEDI, "kedi.to") {
	override val datePattern = "d MMMM yyyy"
	override val tagPrefix = "tur/"
}
