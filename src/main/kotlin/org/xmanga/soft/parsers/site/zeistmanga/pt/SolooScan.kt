package org.xmanga.soft.parsers.site.zeistmanga.pt

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("SOLOOSCAN", "SolooScan", "pt")
internal class SolooScan(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.SOLOOSCAN, "solooscan.blogspot.com") {
	override val mangaCategory = "Recentes"
	override val sateOngoing: String = "Lançando"
	override val sateFinished: String = "Completo"
	override val sateAbandoned: String = "Dropado"
}
