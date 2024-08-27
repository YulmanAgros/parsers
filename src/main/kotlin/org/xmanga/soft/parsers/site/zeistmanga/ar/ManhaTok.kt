package org.xmanga.soft.parsers.site.zeistmanga.ar

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("MANHATOK", "ManhaTok", "ar")
internal class ManhaTok(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.MANHATOK, "manhatok.blogspot.com") {
	override val selectPage = "#seoneurons-target img"
}
