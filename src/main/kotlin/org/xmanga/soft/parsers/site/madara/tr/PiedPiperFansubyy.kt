package org.xmanga.soft.parsers.site.madara.tr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("PIEDPIPERFANSUBYY", "PiedPiperFansubyy", "tr", ContentType.HENTAI)
internal class PiedPiperFansubyy(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.PIEDPIPERFANSUBYY, "piedpiperfansubyy.me", 18) {
	override val datePattern = "d MMMM yyyy"
}
