package org.xmanga.soft.parsers.site.mangareader.th

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("LAMIMANGA", "LamiManga", "th")
internal class LamiManga(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.LAMIMANGA, "mangalami.com", pageSize = 20, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
}
