package org.xmanga.soft.parsers.site.madara.id

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser
import java.util.Locale

@MangaSourceParser("XMANHWA", "XManhwa", "id", ContentType.HENTAI)
internal class XManhwa(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.XMANHWA, "www.xmanhwa.me", 10) {
	override val sourceLocale: Locale = Locale.ENGLISH
	override val selectPage = "img"
}
