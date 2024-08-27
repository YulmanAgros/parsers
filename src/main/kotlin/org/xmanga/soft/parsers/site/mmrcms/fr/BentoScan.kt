package org.xmanga.soft.parsers.site.mmrcms.fr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mmrcms.MmrcmsParser
import java.util.*

@MangaSourceParser("BENTOSCAN", "BentoScan", "fr")
internal class BentoScan(context: MangaLoaderContext) :
	MmrcmsParser(context, MangaParserSource.BENTOSCAN, "bentoscan.com") {
	override val sourceLocale: Locale = Locale.ENGLISH
	override val imgUpdated = ".jpg"
}
