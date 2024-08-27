package org.xmanga.soft.parsers.site.madtheme.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madtheme.MadthemeParser

@MangaSourceParser("TRUEMANGA", "TrueManga", "en")
internal class TrueManga(context: MangaLoaderContext) :
	MadthemeParser(context, MangaParserSource.TRUEMANGA, "truemanga.com")
