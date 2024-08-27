package org.xmanga.soft.parsers.site.mangareader.th

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser
import java.util.Locale

@MangaSourceParser("REAPERTRANS", "ReaperTrans", "th")
internal class ReaperTrans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.REAPERTRANS, "reapertrans.com", pageSize = 30, searchPageSize = 14) {
	override val isTagsExclusionSupported = false
	override val sourceLocale: Locale = Locale.ENGLISH
}
