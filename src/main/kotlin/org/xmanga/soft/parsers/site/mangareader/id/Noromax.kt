package org.xmanga.soft.parsers.site.mangareader.id

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser
import java.util.*

@MangaSourceParser("NOROMAX", "Noromax", "id")
internal class Noromax(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.NOROMAX, "noromax.my.id", pageSize = 20, searchPageSize = 10) {
	override val listUrl = "/Komik"
	override val sourceLocale: Locale = Locale.ENGLISH
	override val isTagsExclusionSupported = false
}
