package org.xmanga.soft.parsers.site.pizzareader.it

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.pizzareader.PizzaReaderParser

@MangaSourceParser("PHOENIXSCANS", "PhoenixScans", "it")
internal class PhoenixScans(context: MangaLoaderContext) :
	PizzaReaderParser(context, MangaParserSource.PHOENIXSCANS, "www.phoenixscans.com")
