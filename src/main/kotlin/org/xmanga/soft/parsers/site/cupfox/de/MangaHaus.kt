package org.xmanga.soft.parsers.site.cupfox.de

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.cupfox.CupFoxParser

@MangaSourceParser("MANGAHAUS", "MangaHaus", "de")
internal class MangaHaus(context: MangaLoaderContext) :
	CupFoxParser(context, MangaParserSource.MANGAHAUS, "www.mangahaus.com")
