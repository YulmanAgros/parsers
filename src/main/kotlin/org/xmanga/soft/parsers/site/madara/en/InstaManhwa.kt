package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.Broken
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.*
import org.xmanga.soft.parsers.site.madara.MadaraParser
import java.util.*

@Broken // Redirect to @XMANHWA
@MangaSourceParser("INSTAMANHWA", "InstaManhwa", "en", ContentType.HENTAI)
internal class InstaManhwa(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.INSTAMANHWA, "www.xmanhwa.me", 15) {
	override val sourceLocale: Locale = Locale.ENGLISH
	override val selectPage = "img"
}
