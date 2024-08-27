package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("RIO2MANGANET", "ZinchanManga.mobi", "en")
internal class Rio2MangaNet(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.RIO2MANGANET, "zinchanmanga.mobi", 10)
