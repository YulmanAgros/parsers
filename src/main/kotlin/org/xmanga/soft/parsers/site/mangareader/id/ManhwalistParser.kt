package org.xmanga.soft.parsers.site.mangareader.id

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser
import java.util.*

@MangaSourceParser("MANHWALIST", "ManhwaList.com", "id")
internal class ManhwalistParser(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MANHWALIST, "manhwalist.com", pageSize = 24, searchPageSize = 10) {
	override val sourceLocale: Locale = Locale.ENGLISH
}
