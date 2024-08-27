package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.Broken
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("MANGASY", "Mangasy", "en")
internal class Mangasy(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGASY, "www.mangasy.com") {
	override val tagPrefix = "manhua-genre/"
}
