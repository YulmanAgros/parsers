package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("ZINCHANMANGA_NET", "ZinchanManga.net", "en")
internal class ZinchanMangaNet(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ZINCHANMANGA_NET, "zinchanmanga.net", 10)
