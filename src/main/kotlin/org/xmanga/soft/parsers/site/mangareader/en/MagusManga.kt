package org.xmanga.soft.parsers.site.mangareader.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MAGUSMANGA", "Recipeslik", "en")
internal class MagusManga(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MAGUSMANGA, "oocini.biz", pageSize = 20, searchPageSize = 10) {
	override val listUrl = "/series"
}
