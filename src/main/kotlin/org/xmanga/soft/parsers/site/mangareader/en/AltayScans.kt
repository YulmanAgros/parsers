package org.xmanga.soft.parsers.site.mangareader.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("ALTAYSCANS", "AltayScans", "en")
internal class AltayScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.ALTAYSCANS, "altayscans.com", pageSize = 20, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
}
