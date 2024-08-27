package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("MANYTOONME", "ManyToon.me", "en", ContentType.HENTAI)
internal class ManyToonMe(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANYTOONME, "manytoon.me", 20) {
	override val listUrl = "manhwa/"
	override val tagPrefix = "manhwa-genre/"
}
