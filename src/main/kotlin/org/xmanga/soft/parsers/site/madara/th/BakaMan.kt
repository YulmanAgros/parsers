package org.xmanga.soft.parsers.site.madara.th

import org.xmanga.soft.parsers.Broken
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("BAKAMAN", "BakaMan", "th")
internal class BakaMan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.BAKAMAN, "bakaman.net", pageSize = 18) {
	override val datePattern = "MMMM dd, yyyy"
}
