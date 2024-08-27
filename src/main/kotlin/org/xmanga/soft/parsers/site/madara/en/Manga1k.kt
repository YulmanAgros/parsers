package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.Broken
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("MANGA1K", "Manga1k", "en", ContentType.HENTAI)
internal class Manga1k(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGA1K, "manga1k.com", 20) {
	override val withoutAjax = true
}
