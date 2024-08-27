package org.xmanga.soft.parsers.site.foolslide.es

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.foolslide.FoolSlideParser

@MangaSourceParser("MENUDO_FANSUB", "Menudo Fansub", "es")
internal class MenudoFansub(context: MangaLoaderContext) :
	FoolSlideParser(context, MangaParserSource.MENUDO_FANSUB, "www.menudo-fansub.com", 25) {
	override val searchUrl = "slide/search/"
	override val listUrl = "slide/directory/"
}
