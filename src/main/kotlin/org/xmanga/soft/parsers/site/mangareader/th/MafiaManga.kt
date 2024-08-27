package org.xmanga.soft.parsers.site.mangareader.th

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MAFIAMANGA", "MafiaManga", "th")
internal class MafiaManga(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MAFIAMANGA, "mafia-manga.com", pageSize = 20, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
}
