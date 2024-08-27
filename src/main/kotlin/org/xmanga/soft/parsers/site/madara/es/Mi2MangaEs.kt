package org.xmanga.soft.parsers.site.madara.es

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("MI2MANGAES", "Mi2MangaEs", "es")
internal class Mi2MangaEs(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MI2MANGAES, "es.mi2manga.com", 10)
