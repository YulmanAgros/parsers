package org.xmanga.soft.parsers.site.mangareader.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("SPIDERSCANS", "SpiderScans", "en")
internal class SpiderScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.SPIDERSCANS, "spiderscans.xyz", pageSize = 20, searchPageSize = 10)
