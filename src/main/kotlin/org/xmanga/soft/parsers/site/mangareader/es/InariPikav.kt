package org.xmanga.soft.parsers.site.mangareader.es

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("INARIPIKAV", "InariPikav", "es")
internal class InariPikav(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.INARIPIKAV, "inaripikav.org", pageSize = 10, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
}
