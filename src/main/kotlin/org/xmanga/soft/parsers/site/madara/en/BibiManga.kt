package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.Broken
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("BIBIMANGA", "BibiManga", "en", ContentType.HENTAI)
internal class BibiManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.BIBIMANGA, "bibimanga.com") {
	override val datePattern = "MMMM dd, yyyy"
}
