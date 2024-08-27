package org.xmanga.soft.parsers.site.madara.pt

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("CAFECOMYAOI", "CafecomYaoi", "pt", ContentType.HENTAI)
internal class CafecomYaoi(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.CAFECOMYAOI, "cafecomyaoi.com.br") {
	override val datePattern = "dd/MM/yyyy"
}
