package org.xmanga.soft.parsers.site.hotcomics.de

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.hotcomics.HotComicsParser
import java.util.Locale

@MangaSourceParser("TOOMICS", "Toomics", "de")
internal class Toomics(context: MangaLoaderContext) :
	HotComicsParser(context, MangaParserSource.TOOMICS, "toomics.top/de") {
	override val sourceLocale: Locale = Locale.ENGLISH
	override val isSearchSupported = false
}
