package org.xmanga.soft.parsers.site.mangareader.th

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MAKIMAAAAA", "Makimaaaaa", "th")
internal class Makimaaaaa(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MAKIMAAAAA, "makimaaaaa.com", pageSize = 30, searchPageSize = 30) {
	override val isTagsExclusionSupported = false
}
