package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.Broken
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("MANHUASY", "ManhuaSy", "en")
internal class Manhuasy(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANHUASY, "www.manhuasy.com") {
	override val listUrl = "manhua/"
	override val tagPrefix = "manhua-genre/"
}
