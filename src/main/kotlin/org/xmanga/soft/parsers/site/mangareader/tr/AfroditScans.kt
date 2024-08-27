package org.xmanga.soft.parsers.site.mangareader.tr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("AFRODITSCANS", "AfroditScans", "tr")
internal class AfroditScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.AFRODITSCANS, "afroditscans.com", pageSize = 20, searchPageSize = 10) {
	override val datePattern = "MMM d, yyyy"
	override val isNetShieldProtected = true
	override val isTagsExclusionSupported = false
}
