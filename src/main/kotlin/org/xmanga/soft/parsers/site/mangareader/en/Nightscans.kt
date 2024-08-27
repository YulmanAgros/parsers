package org.xmanga.soft.parsers.site.mangareader.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("NIGHTSCANS", "NightScans", "en")
internal class Nightscans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.NIGHTSCANS, "night-scans.com", pageSize = 20, searchPageSize = 10) {
	override val listUrl = "/series"
	override val selectMangaListImg = "img.ts-post-image, picture img"
	override val isTagsExclusionSupported = false
}
