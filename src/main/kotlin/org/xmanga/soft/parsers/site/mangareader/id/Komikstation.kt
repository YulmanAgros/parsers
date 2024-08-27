package org.xmanga.soft.parsers.site.mangareader.id

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("KOMIKSTATION", "KomikStation", "id")
internal class Komikstation(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.KOMIKSTATION, "komikstation.co", pageSize = 30, searchPageSize = 30) {
	override val datePattern = "MMM d, yyyy"
	override val isTagsExclusionSupported = false
}
