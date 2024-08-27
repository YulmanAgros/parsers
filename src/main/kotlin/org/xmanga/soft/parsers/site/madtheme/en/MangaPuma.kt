package org.xmanga.soft.parsers.site.madtheme.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madtheme.MadthemeParser

@MangaSourceParser("MANGAPUMA", "MangaPuma", "en")
internal class MangaPuma(context: MangaLoaderContext) :
	MadthemeParser(context, MangaParserSource.MANGAPUMA, "mangapuma.com")
