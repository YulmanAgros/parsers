package org.xmanga.soft.parsers.site.mangareader.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("ELARCPAGE", "ElarcPage", "en")
internal class Elarcpage(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.ELARCPAGE, "elarctoon.com", pageSize = 20, searchPageSize = 10) {
	override val listUrl = "/series"
}
