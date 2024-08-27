package org.xmanga.soft.parsers.site.madara.pt

import org.xmanga.soft.parsers.Broken
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("IMPERIOSCANS", "ImperioScans", "pt")
internal class ImperioScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.IMPERIOSCANS, "imperioscans.com.br") {
	override val datePattern: String = "dd/MM/yyyy"
}
