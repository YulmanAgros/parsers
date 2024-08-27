package org.xmanga.soft.parsers.site.cupfox.ja

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.cupfox.CupFoxParser

@MangaSourceParser("MANGAKOINU", "MangaKoinu", "ja")
internal class MangaKoinu(context: MangaLoaderContext) :
	CupFoxParser(context, MangaParserSource.MANGAKOINU, "www.mangakoinu.com")
