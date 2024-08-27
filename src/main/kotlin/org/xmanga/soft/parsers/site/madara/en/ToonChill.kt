package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("TOONCHILL", "ToonChill", "en")
internal class ToonChill(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.TOONCHILL, "toonchill.com", 32)
