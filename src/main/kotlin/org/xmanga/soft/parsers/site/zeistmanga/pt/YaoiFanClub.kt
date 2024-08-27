package org.xmanga.soft.parsers.site.zeistmanga.pt

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("YAOIFANCLUB", "YaoiFanClub", "pt")
internal class YaoiFanClub(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.YAOIFANCLUB, "www.yaoifanclub.com") {
	override val sateOngoing: String = "Ativo"
	override val sateFinished: String = "Completo"
	override val sateAbandoned: String = "Dropado"
}
