package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAROLLS", "MangaRolls", "en")
internal class MangaRolls(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAROLLS, "mangarolls.net")
