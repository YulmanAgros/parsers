package org.xmanga.soft.parsers.site.mangareader.id

import org.xmanga.soft.parsers.Broken
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@Broken
@MangaSourceParser("KOMIKAV", "KomikAv", "id")
internal class KomikAvParser(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.KOMIKAV, "komikav.com", pageSize = 20, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
}
