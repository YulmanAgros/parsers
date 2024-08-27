package org.xmanga.soft.parsers.site.madara.ru

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAONELOVE", "MangaOneLove", "ru")
internal class MangaoneLove(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAONELOVE, "mangaonelove.site", 10) {
	override val datePattern = "dd.MM.yyyy"
	override val postReq = true
}
