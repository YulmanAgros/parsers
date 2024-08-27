package org.xmanga.soft.parsers.site.madara.ar

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGASTARZ", "Manga-Starz", "ar")
internal class MangaStarz(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGASTARZ, "manga-starz.com", pageSize = 10) {
	override val datePattern = "d MMMM، yyyy"
}
