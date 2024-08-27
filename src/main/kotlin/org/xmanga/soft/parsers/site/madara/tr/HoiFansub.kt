package org.xmanga.soft.parsers.site.madara.tr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("HOIFANSUB", "HoiFansub", "tr")
internal class HoiFansub(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.HOIFANSUB, "hoifansub.com", 20)
