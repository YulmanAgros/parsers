package org.xmanga.soft.parsers.site.madara.es

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser
import java.util.*

@MangaSourceParser("RICHTOSCAN", "RichtoScan", "es")
internal class RichtoScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.RICHTOSCAN, "richtoscan.com") {
	override val tagPrefix = "manga-generos/"
	override val sourceLocale: Locale = Locale.ENGLISH
}
