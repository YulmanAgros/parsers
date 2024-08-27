package org.xmanga.soft.parsers.site.mangareader.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("VOIDSCANS", "HiveToon", "en")
internal class VoidScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.VOIDSCANS, "hivetoon.com", pageSize = 150, searchPageSize = 150) {
	override val datePattern = "MMM d, yyyy"
	override val isTagsExclusionSupported = false
}
