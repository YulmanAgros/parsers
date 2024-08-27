package org.xmanga.soft.parsers.site.madara.es

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAMUNDODRAMA", "MangaMundoDrama", "es")
internal class MangaMundoDrama(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAMUNDODRAMA, "manga.mundodrama.site") {

	override val listUrl = "mg/"
}
