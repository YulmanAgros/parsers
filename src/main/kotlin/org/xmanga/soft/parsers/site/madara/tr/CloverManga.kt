package org.xmanga.soft.parsers.site.madara.tr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("CLOVERMANGA", "CloverManga", "tr")
internal class CloverManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.CLOVERMANGA, "clover-manga.com", 20)
