package org.xmanga.soft.parsers.site.foolslide.it

import org.xmanga.soft.parsers.Broken
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.foolslide.FoolSlideParser

@Broken
@MangaSourceParser("POWERMANGA", "PowerManga", "it")
internal class PowerManga(context: MangaLoaderContext) :
	FoolSlideParser(context, MangaParserSource.POWERMANGA, "reader.powermanga.org") {
	override val pagination = false
}
