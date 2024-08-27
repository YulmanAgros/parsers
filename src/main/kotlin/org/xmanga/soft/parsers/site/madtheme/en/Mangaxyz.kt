package org.xmanga.soft.parsers.site.madtheme.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madtheme.MadthemeParser

@MangaSourceParser("MANGAXYZ", "MangaXyz", "en")
internal class Mangaxyz(context: MangaLoaderContext) :
	MadthemeParser(context, MangaParserSource.MANGAXYZ, "mangaxyz.com")
