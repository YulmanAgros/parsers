package org.xmanga.soft.parsers.site.madara.id

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser
import java.util.*

@MangaSourceParser("BIRDTOON", "BirdToon", "id", ContentType.HENTAI)
internal class BirdToon(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.BIRDTOON, "birdtoon.net", 10) {
	override val sourceLocale: Locale = Locale.ENGLISH
	override val tagPrefix = "komik-genre/"
	override val listUrl = "komik/"
}
