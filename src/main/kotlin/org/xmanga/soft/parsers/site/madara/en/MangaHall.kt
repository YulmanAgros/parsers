package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAHALL", "MangaHall", "en", ContentType.HENTAI)
internal class MangaHall(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAHALL, "mangahall.org", 24)
