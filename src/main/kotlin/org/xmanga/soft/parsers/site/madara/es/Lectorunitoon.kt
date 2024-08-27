package org.xmanga.soft.parsers.site.madara.es

import org.xmanga.soft.parsers.Broken
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("LECTORUNITOON", "LectoruniToon", "es")
internal class Lectorunitoon(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LECTORUNITOON, "lectorunitoon.com", 10) {
	override val tagPrefix = "generos/"
	override val datePattern = "dd/MM/yyyy"
}
