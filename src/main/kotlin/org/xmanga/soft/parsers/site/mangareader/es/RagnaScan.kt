package org.xmanga.soft.parsers.site.mangareader.es

import org.xmanga.soft.parsers.Broken
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@Broken
@MangaSourceParser("RAGNASCAN", "RagnaScan", "es")
internal class RagnaScan(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.RAGNASCAN, "ragnascan.com", pageSize = 5, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
}
