package org.xmanga.soft.parsers.site.madara.es

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("TOPCOMICPORNO", "TopComicPorno", "es", ContentType.HENTAI)
internal class TopComicPorno(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.TOPCOMICPORNO, "topcomicporno.com", 18) {
	override val datePattern = "MMM dd, yy"
}
