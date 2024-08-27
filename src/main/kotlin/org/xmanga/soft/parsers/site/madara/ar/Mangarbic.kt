package org.xmanga.soft.parsers.site.madara.ar

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGARBIC", "MangaArabic", "ar")
internal class Mangarbic(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGARBIC, "mangarabic.com") {
	override val postReq = true
	override val datePattern = "yyyy/MM/dd"
}
