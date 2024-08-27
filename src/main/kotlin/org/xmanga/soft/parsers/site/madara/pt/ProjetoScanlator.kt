package org.xmanga.soft.parsers.site.madara.pt

import org.xmanga.soft.parsers.Broken
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("PROJETOSCANLATOR", "ProjetoScanlator", "pt")
internal class ProjetoScanlator(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.PROJETOSCANLATOR, "projetoscanlator.com", 10) {
	override val datePattern: String = "dd/MM/yyyy"
}
