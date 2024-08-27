package org.xmanga.soft.parsers.site.madara.pt

import org.xmanga.soft.parsers.Broken
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("MOONWITCHINLOVESCAN", "MoonWitchinLoveScan", "pt")
internal class Moonwitchinlovescan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MOONWITCHINLOVESCAN, "moonwitchinlovescan.com", 10) {
	override val datePattern: String = "dd 'de' MMMMM 'de' yyyy"
}
