package org.xmanga.soft.parsers.site.madara.tr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAWT", "MangaWt.com", "tr")
internal class Mangawt(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAWT, "mangawt.com")
