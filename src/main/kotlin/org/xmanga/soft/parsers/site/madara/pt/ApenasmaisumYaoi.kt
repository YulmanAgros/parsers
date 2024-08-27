package org.xmanga.soft.parsers.site.madara.pt

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("APENASMAISUMYAOI", "Apenasmaisum Yaoi", "pt", ContentType.HENTAI)
internal class ApenasmaisumYaoi(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.APENASMAISUMYAOI, "apenasmaisumyaoi.com") {
	override val datePattern: String = "dd 'de' MMMMM 'de' yyyy"
}
