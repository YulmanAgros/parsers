package org.xmanga.soft.parsers.site.mangareader.th

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("DRAGONMANGA", "DragonManga", "th", ContentType.HENTAI)
internal class DragonManga(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.DRAGONMANGA,
		"www.dragon-manga.com",
		pageSize = 40,
		searchPageSize = 10,
	)
