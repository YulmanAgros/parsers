package org.xmanga.soft.parsers.site.hotcomics.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.hotcomics.HotComicsParser

@MangaSourceParser("HOTCOMICS", "HotComics", "en")
internal class HotComics(context: MangaLoaderContext) :
	HotComicsParser(context, MangaParserSource.HOTCOMICS, "hotcomics.me/en")
