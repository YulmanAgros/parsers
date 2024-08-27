package org.xmanga.soft.parsers.site.mmrcms.fr

import org.xmanga.soft.parsers.Broken
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mmrcms.MmrcmsParser
import java.util.*

@Broken
@MangaSourceParser("SCANMANGA", "ScanManga", "fr")
internal class ScanManga(context: MangaLoaderContext) :
	MmrcmsParser(context, MangaParserSource.SCANMANGA, "scan-manga.me") {
	override val imgUpdated = ".jpg"
	override val sourceLocale: Locale = Locale.ENGLISH
}
