package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAHENTAI", "MangaHentai", "en", ContentType.HENTAI)
internal class MangaHentai(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAHENTAI, "mangahentai.me", 20) {

	override val tagPrefix = "manga-hentai-genre/"
	override val listUrl = "manga-hentai/"
}
