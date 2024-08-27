package org.xmanga.soft.parsers.site.madara.vi

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("HENTAIVNCAFE", "HentaiVnCafe", "vi", ContentType.HENTAI)
internal class HentaiVnCafe(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.HENTAIVNCAFE, "hentaivn.cafe", 24) {
	override val listUrl = "truyen-hentai/"
	override val tagPrefix = "the-loai/"
	override val datePattern = "dd/MM/yyyy"
}
