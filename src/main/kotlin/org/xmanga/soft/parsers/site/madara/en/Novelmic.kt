package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("NOVELMIC", "NovelMic", "en")
internal class Novelmic(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.NOVELMIC, "novelmic.com", 20) {
	override val postReq = true
}
