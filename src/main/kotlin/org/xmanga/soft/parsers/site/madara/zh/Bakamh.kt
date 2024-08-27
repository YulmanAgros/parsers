package org.xmanga.soft.parsers.site.madara.zh

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("BAKAMH", "Bakamh", "zh")
internal class Bakamh(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.BAKAMH, "bakamh.com") {
	override val datePattern = "YYYY 年 M 月 d 日"
}
