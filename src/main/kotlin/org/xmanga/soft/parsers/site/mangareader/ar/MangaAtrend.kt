package org.xmanga.soft.parsers.site.mangareader.ar

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MANGAATREND", "MangaAtrend", "ar")
internal class MangaAtrend(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MANGAATREND, "mangaatrend.net", pageSize = 30, searchPageSize = 10)
