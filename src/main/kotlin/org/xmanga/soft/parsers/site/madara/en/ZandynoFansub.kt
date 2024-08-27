package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("ZANDYNOFANSUB", "Zandyno Fansub", "en")
internal class ZandynoFansub(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ZANDYNOFANSUB, "zandynofansub.aishiteru.org", 20) {
	override val listUrl = "series/"
	override val datePattern = "dd.MM.yyyy"
}
