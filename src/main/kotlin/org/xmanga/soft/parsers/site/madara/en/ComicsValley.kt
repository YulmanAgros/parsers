package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("COMICSVALLEY", "ComicsValley", "en", ContentType.HENTAI)
internal class ComicsValley(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.COMICSVALLEY, "comicsvalley.com") {
	override val listUrl = "adult-comics/"
	override val tagPrefix = "comic-genre/"
	override val datePattern = "dd/MM/yyyy"
}
