package org.xmanga.soft.parsers.site.mangareader.tr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MANGASIGINAGI", "MangaSiginagi", "tr")
internal class MangaSiginagi(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MANGASIGINAGI, "mangasiginagi.com", pageSize = 20, searchPageSize = 10)
