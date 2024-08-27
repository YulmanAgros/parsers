package org.xmanga.soft.parsers.site.mangareader.id

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser
import java.util.*

@MangaSourceParser("KOMIKLOVERS", "KomikLovers", "id")
internal class KomikLovers(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.KOMIKLOVERS, "komiklovers.com", pageSize = 20, searchPageSize = 10) {
	override val sourceLocale: Locale = Locale.ENGLISH
	override val listUrl = "/komik"
}
