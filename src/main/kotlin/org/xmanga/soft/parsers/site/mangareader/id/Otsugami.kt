package org.xmanga.soft.parsers.site.mangareader.id

import org.xmanga.soft.parsers.Broken
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser
import java.util.*

@Broken
@MangaSourceParser("OTSUGAMI", "Otsugami", "id")
internal class Otsugami(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.OTSUGAMI, "otsugami.id", pageSize = 40, searchPageSize = 10) {
	override val sourceLocale: Locale = Locale.ENGLISH

}
