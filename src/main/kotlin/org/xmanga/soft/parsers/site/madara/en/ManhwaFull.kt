package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("MANHWAFULL", "ManhwaFull", "en")
internal class ManhwaFull(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANHWAFULL, "manhwafull.com") {
	override val listUrl = "manga-all-manhwa/"
	override val datePattern = "MM/dd/yyyy"
}
