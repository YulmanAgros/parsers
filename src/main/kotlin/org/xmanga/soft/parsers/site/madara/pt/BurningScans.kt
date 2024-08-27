package org.xmanga.soft.parsers.site.madara.pt

import org.xmanga.soft.parsers.Broken
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("BURNINGSCANS", "BurningScans", "pt")
internal class BurningScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.BURNINGSCANS, "burningscans.com") {
	override val datePattern = "dd/MM/yyyy"
}
