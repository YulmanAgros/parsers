package org.xmanga.soft.parsers.site.madara.all

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser
import java.util.*

@MangaSourceParser("KDTSCANS", "KdtScans", "")
internal class KdtScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.KDTSCANS, "kdtscans.com", 10) {
	override val sourceLocale: Locale = Locale("es")
}
