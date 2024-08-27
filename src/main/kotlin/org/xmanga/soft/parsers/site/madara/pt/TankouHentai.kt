package org.xmanga.soft.parsers.site.madara.pt

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("TANKOUHENTAI", "TankouHentai", "pt", ContentType.HENTAI)
internal class TankouHentai(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.TANKOUHENTAI, "tankouhentai.com", pageSize = 16) {
	override val datePattern: String = "dd 'de' MMMMM 'de' yyyy"
}
