package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAONLINETEAM", "MangaOnlineTeam", "en")
internal class MangaOnlineTeam(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAONLINETEAM, "mangaonlineteam.com", 10)
