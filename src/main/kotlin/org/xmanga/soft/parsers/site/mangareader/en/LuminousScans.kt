package org.xmanga.soft.parsers.site.mangareader.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("LUMINOUSSCANS", "RadiantScans", "en")
internal class LuminousScans(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.LUMINOUSSCANS,
		"radiantscans.com",
		pageSize = 20,
		searchPageSize = 10,
	) {

	override val listUrl = "/series"
	override val isTagsExclusionSupported = false
}
