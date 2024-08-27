package org.xmanga.soft.parsers.site.mangareader.ar

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("SCARMANGA", "ScarManga", "ar")
internal class ScarManga(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.SCARMANGA, "scarmanga.com", pageSize = 20, searchPageSize = 10) {
	override val listUrl = "/series"
	override val isTagsExclusionSupported = false
}
