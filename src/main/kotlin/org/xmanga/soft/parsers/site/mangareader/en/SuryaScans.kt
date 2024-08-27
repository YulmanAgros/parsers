package org.xmanga.soft.parsers.site.mangareader.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("SURYASCANS", "SuryaScans", "en")
internal class SuryaScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.SURYASCANS, "suryacomics.com", pageSize = 5, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
}
