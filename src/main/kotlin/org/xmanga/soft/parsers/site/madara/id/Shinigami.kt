package org.xmanga.soft.parsers.site.madara.id

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser
import java.util.*

@MangaSourceParser("SHINIGAMI", "Shinigami", "id")
internal class Shinigami(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.SHINIGAMI, "shinigami03.com", 10) {
	override val tagPrefix = "genre/"
	override val listUrl = "series/"
	override val sourceLocale: Locale = Locale.ENGLISH
}
