package org.xmanga.soft.parsers.site.mangareader.id

import org.xmanga.soft.parsers.Broken
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@Broken
@MangaSourceParser("WARUNGKOMIK", "WarungKomik", "id")
internal class WarungKomik(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.WARUNGKOMIK, "warungkomik.com", pageSize = 20, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
}
