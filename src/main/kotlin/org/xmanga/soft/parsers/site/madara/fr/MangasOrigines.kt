package org.xmanga.soft.parsers.site.madara.fr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGASORIGINES", "MangasOrigines.fr", "fr")
internal class MangasOrigines(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGASORIGINES, "mangas-origines.fr") {
	override val datePattern = "dd/MM/yyyy"
	override val tagPrefix = "manga-genres/"
	override val listUrl = "oeuvre/"
}
