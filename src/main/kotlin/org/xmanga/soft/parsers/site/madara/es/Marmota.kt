package org.xmanga.soft.parsers.site.madara.es

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("MARMOTA", "Marmota", "es", ContentType.COMICS)
internal class Marmota(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MARMOTA, "marmota.me", 48) {
	override val datePattern = "d 'de' MMMMM 'de' yyyy"
	override val tagPrefix = "genero/"
	override val listUrl = "comic/"
}
