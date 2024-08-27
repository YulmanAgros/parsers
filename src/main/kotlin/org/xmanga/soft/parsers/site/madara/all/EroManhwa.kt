package org.xmanga.soft.parsers.site.madara.all

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser
import java.util.*

@MangaSourceParser("EROMANHWA", "EroManhwa", "", ContentType.HENTAI)
internal class EroManhwa(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.EROMANHWA, "eromanhwa.org") {
	override val sourceLocale: Locale = Locale.ENGLISH
}
