package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("HARIMANGA", "HariManga", "en")
internal class HariManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.HARIMANGA, "harimanga.com", pageSize = 10)
