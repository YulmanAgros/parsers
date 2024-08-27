package org.xmanga.soft.parsers.site.madara.pt

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("LERHENTAI", "LerHentai", "pt", ContentType.HENTAI)
internal class LerHentai(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LERHENTAI, "lerhentai.com", 20) {
	override val datePattern: String = "dd 'de' MMMMM 'de' yyyy"
}
