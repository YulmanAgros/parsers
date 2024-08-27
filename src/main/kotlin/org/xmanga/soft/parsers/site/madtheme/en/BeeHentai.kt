package org.xmanga.soft.parsers.site.madtheme.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madtheme.MadthemeParser

@MangaSourceParser("BEEHENTAI", "BeeHentai", "en", ContentType.HENTAI)
internal class BeeHentai(context: MangaLoaderContext) :
	MadthemeParser(context, MangaParserSource.BEEHENTAI, "beehentai.com") {
	override val selectDesc = "div.section-body"
}
