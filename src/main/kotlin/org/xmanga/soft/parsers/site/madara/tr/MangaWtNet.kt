package org.xmanga.soft.parsers.site.madara.tr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAWT_NET", "MangaWt.net", "tr")
internal class MangaWtNet(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAWT_NET, "mangawt.net")
