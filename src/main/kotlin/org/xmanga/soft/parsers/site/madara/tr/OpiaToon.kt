package org.xmanga.soft.parsers.site.madara.tr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

//This source requires an account.
@MangaSourceParser("OPIATOON", "OpiaToon", "tr")
internal class OpiaToon(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.OPIATOON, "opiatoon.biz", 20) {
	override val datePattern = "d MMMM"
}
