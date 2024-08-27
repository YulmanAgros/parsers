package org.xmanga.soft.parsers.site.mangareader.es

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("INARIMANGA", "InariManga", "es")
internal class InariManga(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.INARIMANGA, "nakamatoon.com", pageSize = 20, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
}
