package org.xmanga.soft.parsers.site.mangareader.id

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser
import java.util.*

@MangaSourceParser("MONZEEKOMIK", "MonzeeKomik", "id")
internal class MonzeeKomik(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.MONZEEKOMIK,
		"www.monzeekomik.my.id",
		pageSize = 30,
		searchPageSize = 10,
	) {
	override val sourceLocale: Locale = Locale.ENGLISH
	override val isTagsExclusionSupported = false
}
