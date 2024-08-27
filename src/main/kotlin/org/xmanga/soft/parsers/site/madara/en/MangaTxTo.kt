package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGATX_TO", "MangaTx.to", "en")
internal class MangaTxTo(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGATX_TO, "mangatx.to", 10) {
	override val tagPrefix = "manhua-genre/"
}
