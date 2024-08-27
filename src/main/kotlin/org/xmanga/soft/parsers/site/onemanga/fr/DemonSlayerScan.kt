package org.xmanga.soft.parsers.site.onemanga.fr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.onemanga.OneMangaParser

@MangaSourceParser("DEMONSLAYERSCAN", "DemonSlayerScan", "fr")
internal class DemonSlayerScan(context: MangaLoaderContext) :
	OneMangaParser(context, MangaParserSource.DEMONSLAYERSCAN, "demonslayerscan.com")
