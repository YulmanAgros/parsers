package org.xmanga.soft.parsers.site.guya.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.guya.GuyaParser

@MangaSourceParser("GUYACUBARI", "GuyaCubari", "en")
internal class GuyaCubari(context: MangaLoaderContext) :
	GuyaParser(context, MangaParserSource.GUYACUBARI, "guya.cubari.moe")
