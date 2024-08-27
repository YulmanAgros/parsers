package org.xmanga.soft.parsers.site.mangareader.tr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("CULTURESUBS", "CultureSubs", "tr")
internal class CultureSubs(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.CULTURESUBS, "culturesubs.com", pageSize = 20, searchPageSize = 10) {
	override val isMultipleTagsSupported = false
}
