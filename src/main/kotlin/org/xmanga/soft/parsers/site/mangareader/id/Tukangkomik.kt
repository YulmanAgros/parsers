package org.xmanga.soft.parsers.site.mangareader.id

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser
import java.util.*

@MangaSourceParser("TUKANGKOMIK", "Tukang Komik", "id")
internal class Tukangkomik(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.TUKANGKOMIK, "tukangkomik.id", pageSize = 20, searchPageSize = 20) {
	override val datePattern = "MMM d, yyyy"
	override val sourceLocale: Locale = Locale.ENGLISH
	override val isTagsExclusionSupported = false
}
