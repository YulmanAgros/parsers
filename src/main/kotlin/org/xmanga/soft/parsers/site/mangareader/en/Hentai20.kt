package org.xmanga.soft.parsers.site.mangareader.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("HENTAI20", "Hentai20", "en", ContentType.HENTAI)
internal class Hentai20(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.HENTAI20, "hentai20.io", pageSize = 20, searchPageSize = 10)
