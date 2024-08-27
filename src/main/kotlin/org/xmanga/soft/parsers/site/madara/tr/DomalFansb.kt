package org.xmanga.soft.parsers.site.madara.tr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("DOMALFANSB", "DomalFansub", "tr")
internal class DomalFansb(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.DOMALFANSB, "domalfansub.com.tr") {
	override val datePattern = "d MMMM yyyy"
	override val tagPrefix = "manga-turleri/"
}
