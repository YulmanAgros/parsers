package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("LUXMANGA", "LuxManga", "en")
internal class LuxManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LUXMANGA, "luxmanga.net")
