package org.xmanga.soft.parsers.site.mangareader.tr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("PATIMANGA", "PatiManga", "tr")
internal class PatiManga(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.PATIMANGA, "www.patimanga.com", pageSize = 20, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
}

