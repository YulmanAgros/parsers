package org.xmanga.soft.parsers.site.madara.th

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("NEKOPOST", "NekoPost", "th")
internal class NekoPost(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.NEKOPOST, "www.nekopost.co") {
	override val postReq = true
	override val datePattern = "d MMMM yyyy"
}
