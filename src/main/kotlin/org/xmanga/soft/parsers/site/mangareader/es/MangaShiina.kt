package org.xmanga.soft.parsers.site.mangareader.es

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MANGASHIINA", "MangaMukai.com", "es")
internal class MangaShiina(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MANGASHIINA, "mangamukai.com", pageSize = 20, searchPageSize = 10)
