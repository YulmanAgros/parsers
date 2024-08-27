package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGA1ST", "Manga1st", "en")
internal class Manga1st(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGA1ST, "manga1st.online") {
	override val datePattern = "d MMMM، yyyy"
}
