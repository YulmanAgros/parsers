package org.xmanga.soft.parsers.site.mangareader.id

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser
import java.util.Locale

@MangaSourceParser("KOMIKINDO_MOE", "KomikIndo.moe", "id")
internal class KomikIndo(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.KOMIKINDO_MOE, "komikindo.moe", pageSize = 20, searchPageSize = 10) {
	override val sourceLocale: Locale = Locale.ENGLISH
}
