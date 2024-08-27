package org.xmanga.soft.parsers.site.mangareader.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("ASTRASCANS", "AstraScans", "en")
internal class AstraScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.ASTRASCANS, "astrascans.org", pageSize = 20, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
	override val listUrl = "/series"
}
