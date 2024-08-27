package org.xmanga.soft.parsers.site.mangareader.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("VARNASCAN", "VarnaScan", "en")
internal class VarnaScan(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.VARNASCAN, "varnascan.com", pageSize = 20, searchPageSize = 10)
