package org.xmanga.soft.parsers.site.mangareader.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("ENRYUMANGA", "EnryuManga", "en")
internal class EnryuManga(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.ENRYUMANGA, "enryumanga.net", pageSize = 20, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
}
