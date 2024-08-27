package org.xmanga.soft.parsers.site.pizzareader.it

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.pizzareader.PizzaReaderParser

@MangaSourceParser("HASTATEAM_READER", "HastaTeamReader", "it")
internal class HastaTeamReader(context: MangaLoaderContext) :
	PizzaReaderParser(context, MangaParserSource.HASTATEAM_READER, "reader.hastateam.com")
