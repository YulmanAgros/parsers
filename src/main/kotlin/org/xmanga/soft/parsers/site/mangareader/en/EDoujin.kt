package org.xmanga.soft.parsers.site.mangareader.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("EDOUJIN", "EHentaiManga", "en", ContentType.HENTAI)
internal class EDoujin(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.EDOUJIN, "ehentaimanga.com", pageSize = 25, searchPageSize = 10)
