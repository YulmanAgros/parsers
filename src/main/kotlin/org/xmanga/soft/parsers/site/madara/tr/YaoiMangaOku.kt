package org.xmanga.soft.parsers.site.madara.tr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("YAOIMANGAOKU", "YaoiMangaOku", "tr", ContentType.HENTAI)
internal class YaoiMangaOku(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.YAOIMANGAOKU, "yaoimangaoku.com", 16) {
	override val datePattern = "d MMMM yyyy"
}
