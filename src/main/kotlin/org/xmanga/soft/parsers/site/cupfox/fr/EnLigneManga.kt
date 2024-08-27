package org.xmanga.soft.parsers.site.cupfox.fr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.cupfox.CupFoxParser

@MangaSourceParser("ENLIGNEMANGA", "EnLigneManga", "fr")
internal class EnLigneManga(context: MangaLoaderContext) :
	CupFoxParser(context, MangaParserSource.ENLIGNEMANGA, "www.enlignemanga.com")
