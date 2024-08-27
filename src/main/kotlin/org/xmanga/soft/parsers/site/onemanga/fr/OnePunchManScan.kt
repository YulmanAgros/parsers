package org.xmanga.soft.parsers.site.onemanga.fr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.onemanga.OneMangaParser

@MangaSourceParser("ONEPUNCHMANSCAN", "OnePunchManScan", "fr")
internal class OnePunchManScan(context: MangaLoaderContext) :
	OneMangaParser(context, MangaParserSource.ONEPUNCHMANSCAN, "onepunchmanscan.com")
