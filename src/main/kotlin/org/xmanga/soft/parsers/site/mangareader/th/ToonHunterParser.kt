package org.xmanga.soft.parsers.site.mangareader.th

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("TOONHUNTER", "ToonHunter", "th")
internal class ToonHunterParser(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.TOONHUNTER, "toonhunter.com", pageSize = 30, searchPageSize = 10) {
	override val datePattern = "MMM d, yyyy"
	override val isTagsExclusionSupported = false
}
