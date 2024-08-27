package org.xmanga.soft.parsers.site.madara.tr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("WEBTOONHATTI", "WebtoonHatti", "tr")
internal class Webtoonhatti(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.WEBTOONHATTI, "webtoonhatti.net", 20) {
	override val listUrl = "webtoon/"
	override val tagPrefix = "webtoon-tur/"
	override val datePattern = "d MMMM"
}
