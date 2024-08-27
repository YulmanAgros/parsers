package org.xmanga.soft.parsers.site.mangareader.th

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("POPSMANGA", "PopsManga", "th")
internal class PopsManga(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.POPSMANGA, "popsmanga.com", pageSize = 20, searchPageSize = 14) {
	override val isTagsExclusionSupported = false
}
