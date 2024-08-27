package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGASUSHI", "MangaSushi", "en")
internal class MangaSushi(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGASUSHI, "mangasushi.org")
