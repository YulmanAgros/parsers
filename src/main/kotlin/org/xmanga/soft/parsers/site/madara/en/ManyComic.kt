package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("MANYCOMIC", "ManyComic", "en", ContentType.HENTAI)
internal class ManyComic(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANYCOMIC, "manycomic.com") {
	override val postReq = true
	override val tagPrefix = "comic-genre/"
}
