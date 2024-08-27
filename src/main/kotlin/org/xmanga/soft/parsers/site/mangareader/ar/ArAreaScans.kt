package org.xmanga.soft.parsers.site.mangareader.ar

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("ARAREASCANS", "ArAreaScans", "ar")
internal class ArAreaScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.ARAREASCANS, "ar.areascans.org", pageSize = 20, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
}
