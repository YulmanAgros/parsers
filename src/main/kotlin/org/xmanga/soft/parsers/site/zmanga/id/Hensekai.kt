package org.xmanga.soft.parsers.site.zmanga.id

import org.xmanga.soft.parsers.Broken
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.zmanga.ZMangaParser
import java.util.*

@Broken
@MangaSourceParser("HENSEKAI", "Hensekai", "id", ContentType.HENTAI)
internal class Hensekai(context: MangaLoaderContext) :
	ZMangaParser(context, MangaParserSource.HENSEKAI, "hensekai.com") {
	override val sourceLocale: Locale = Locale.ENGLISH
}
