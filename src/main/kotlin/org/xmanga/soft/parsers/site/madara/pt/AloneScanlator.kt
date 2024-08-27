package org.xmanga.soft.parsers.site.madara.pt

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("ALONESCANLATOR", "AloneScanlator", "pt")
internal class AloneScanlator(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ALONESCANLATOR, "alonescanlator.com.br", 10) {
	override val datePattern: String = "dd/MM/yyyy"
}
