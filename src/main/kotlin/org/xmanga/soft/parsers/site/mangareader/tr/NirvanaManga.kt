package org.xmanga.soft.parsers.site.mangareader.tr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("NIRVANAMANGA", "NirvanaManga", "tr")
internal class NirvanaManga(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.NIRVANAMANGA, "nirvanamanga.com", pageSize = 20, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
}
