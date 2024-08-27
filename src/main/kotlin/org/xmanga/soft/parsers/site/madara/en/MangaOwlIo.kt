package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAOWL_IO", "MangaOwl.io", "en")
internal class MangaOwlIo(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAOWL_IO, "mangaowl.io") {
	override val listUrl = "mangaowl-all/"
}
