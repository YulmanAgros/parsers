package org.xmanga.soft.parsers.site.mangareader.id

import org.xmanga.soft.parsers.Broken
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@Broken
@MangaSourceParser("SHEAKOMIK", "SheaKomik", "id")
internal class Sheakomik(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.SHEAKOMIK, "sheakomik.com", pageSize = 40, searchPageSize = 40) {
	override val datePattern = "MMM d, yyyy"
	override val isTagsExclusionSupported = false
}
