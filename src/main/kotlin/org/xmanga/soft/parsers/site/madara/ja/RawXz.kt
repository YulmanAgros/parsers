package org.xmanga.soft.parsers.site.madara.ja

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("RAWXZ", "RawXz", "ja")
internal class RawXz(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.RAWXZ, "rawxz.si") {
	override val listUrl = "jp-manga/"
}
