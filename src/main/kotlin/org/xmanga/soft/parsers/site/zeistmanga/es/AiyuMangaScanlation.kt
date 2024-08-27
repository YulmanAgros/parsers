package org.xmanga.soft.parsers.site.zeistmanga.es

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("AIYUMANGASCANLATION", "AiyuManhua", "es")
internal class AiyuMangaScanlation(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.AIYUMANGASCANLATION, "www.aiyumanhua.com") {
	override val selectPage = "article.chapter img"
}
