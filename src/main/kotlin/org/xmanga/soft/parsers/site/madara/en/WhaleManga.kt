package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("WHALEMANGA", "WhaleManga", "en")
internal class WhaleManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.WHALEMANGA, "whalemanga.com", 10)
