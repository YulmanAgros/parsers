package org.xmanga.soft.parsers.site.mangareader.id

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser
import java.util.*

@MangaSourceParser("SOULSCANS", "SoulScans", "id")
internal class SoulScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.SOULSCANS, "soulscans.my.id", pageSize = 30, searchPageSize = 30) {
	override val datePattern = "MMM d, yyyy"
	override val sourceLocale: Locale = Locale.ENGLISH
	override val isTagsExclusionSupported = false
}
