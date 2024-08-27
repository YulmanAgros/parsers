package org.xmanga.soft.parsers.site.mangareader.id

import org.xmanga.soft.parsers.Broken
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@Broken
@MangaSourceParser("COMICASO", "Comicaso", "id")
internal class Comicaso(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.COMICASO, "comicaso.org", pageSize = 20, searchPageSize = 10) {
	override val encodedSrc = true
	override val isTagsExclusionSupported = false
}
