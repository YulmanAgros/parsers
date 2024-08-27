package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("MANHWAHENTAITO", "ManhwaHentai.to", "en", ContentType.HENTAI)
internal class ManhwaHentaiTo(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANHWAHENTAITO, "manhwahentai.to", 10) {
	override val tagPrefix = "pornhwa-genre/"
	override val listUrl = "pornhwa/"
	override val datePattern = "d MMMM yyyy"
}
