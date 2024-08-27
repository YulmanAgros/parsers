package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("PORNCOMIXONLINE", "PornComix Online", "en", ContentType.HENTAI)
internal class PornComixOnline(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.PORNCOMIXONLINE, "porncomix.online") {
	override val listUrl = "comic/"
	override val tagPrefix = "comic-genre/"
}
