package org.xmanga.soft.parsers.site.mangabox.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.config.ConfigKey
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangabox.MangaboxParser

@MangaSourceParser("HMANGABAT", "MangaBat", "en")
internal class Mangabat(context: MangaLoaderContext) :
	MangaboxParser(context, MangaParserSource.HMANGABAT) {
	override val configKeyDomain = ConfigKey.Domain("h.mangabat.com", "readmangabat.com")
	override val otherDomain = "readmangabat.com"
	override val selectTagMap = "div.panel-category p.pn-category-row:not(.pn-category-row-border) a"
}
