package org.xmanga.soft.parsers.site.madara.tr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("DIAMONDFANSUB", "DiamondFansub", "tr")
internal class DiamondFansub(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.DIAMONDFANSUB, "diamondfansub.com", 10) {
	override val datePattern = "d MMMM"
	override val listUrl = "seri/"
	override val tagPrefix = "seri-turu/"
}
