package org.xmanga.soft.parsers.site.mangareader.ar

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("THUNDERSCANS", "ThunderScans", "ar")
internal class ThunderScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.THUNDERSCANS, "thunderscans.com", pageSize = 32, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
	override val selectChapter = ".eplister > ul > li"
}
