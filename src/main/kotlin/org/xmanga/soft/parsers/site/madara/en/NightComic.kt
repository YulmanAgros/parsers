package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("NIGHTCOMIC", "Night Comic", "en")
internal class NightComic(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.NIGHTCOMIC, "www.nightcomic.com") {
	override val postReq = true
}
