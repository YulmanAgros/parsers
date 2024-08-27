package org.xmanga.soft.parsers.site.mmrcms.fr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mmrcms.MmrcmsParser
import java.util.*

@MangaSourceParser("SCANMANGAVF_WS", "ScanMangaVf.ws", "fr")
internal class ScanMangaVfWs(context: MangaLoaderContext) :
	MmrcmsParser(context, MangaParserSource.SCANMANGAVF_WS, "scanmanga-vf.me") {
	override val imgUpdated = ".jpg"
	override val selectTag = "dt:contains(Genres)"
	override val selectAlt = "dt:contains(Appelé aussi)"
	override val sourceLocale: Locale = Locale.ENGLISH
}
