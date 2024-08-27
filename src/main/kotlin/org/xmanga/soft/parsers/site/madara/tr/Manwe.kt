package org.xmanga.soft.parsers.site.madara.tr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("MANWE", "Manwe", "tr")
internal class Manwe(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANWE, "manwe.pro", 20)
