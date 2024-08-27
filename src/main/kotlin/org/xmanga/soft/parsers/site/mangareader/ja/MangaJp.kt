package org.xmanga.soft.parsers.site.mangareader.ja

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser
import java.util.*

@MangaSourceParser("MANGAJP", "MangaJp", "ja")
internal class MangaJp(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MANGAJP, "mangajp.top", pageSize = 54, searchPageSize = 10) {
	override val sourceLocale: Locale = Locale.ENGLISH
	override val isTagsExclusionSupported = false
}
