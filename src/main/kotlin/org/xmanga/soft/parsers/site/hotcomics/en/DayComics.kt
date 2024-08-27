package org.xmanga.soft.parsers.site.hotcomics.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.hotcomics.HotComicsParser

@MangaSourceParser("DAYCOMICS", "DayComics", "en")
internal class DayComics(context: MangaLoaderContext) :
	HotComicsParser(context, MangaParserSource.DAYCOMICS, "daycomics.me/en")
