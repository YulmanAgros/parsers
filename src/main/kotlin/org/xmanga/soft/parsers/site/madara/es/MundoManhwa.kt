package org.xmanga.soft.parsers.site.madara.es

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("MUNDO_MANHWA", "MundoManhwa", "es")
internal class MundoManhwa(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MUNDO_MANHWA, "mundomanhwa.com", 10)
