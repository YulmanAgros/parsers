package org.xmanga.soft.parsers.site.madara.all

import org.xmanga.soft.parsers.Broken
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser
import java.util.*

@Broken
@MangaSourceParser("MANGATOP", "MangaTop", "", ContentType.HENTAI)
internal class MangaTop(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGATOP, "mangatop.site") {
	override val datePattern = "d MMMM yyyy"
	override val sourceLocale: Locale = Locale.ENGLISH
	override val stylePage = ""
}
