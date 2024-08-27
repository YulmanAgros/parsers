package org.xmanga.soft.parsers.site.madara.tr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("LILYUMFANSUB", "LilyumFansub", "tr")
internal class LilyumFansub(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LILYUMFANSUB, "lilyumfansub.com.tr", 16)
