package org.xmanga.soft.parsers.site.nepnep.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.nepnep.NepnepParser

@MangaSourceParser("MANGA4LIFE", "Manga4Life", "en")
internal class Manga4Life(context: MangaLoaderContext) :
	NepnepParser(context, MangaParserSource.MANGA4LIFE, "manga4life.com")
