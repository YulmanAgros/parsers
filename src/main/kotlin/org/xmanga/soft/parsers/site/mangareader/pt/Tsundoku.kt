package org.xmanga.soft.parsers.site.mangareader.pt

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("TSUNDOKU", "Tsundoku", "pt")
internal class Tsundoku(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.TSUNDOKU, "tsundoku.com.br", pageSize = 50, searchPageSize = 50) {
	override val datePattern = "MMM d, yyyy"
	override val isTagsExclusionSupported = false
}
