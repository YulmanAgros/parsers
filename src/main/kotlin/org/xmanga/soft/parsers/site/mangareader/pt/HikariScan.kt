package org.xmanga.soft.parsers.site.mangareader.pt

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("HIKARISCAN", "HikariScan", "pt")
internal class HikariScan(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.HIKARISCAN, "hikariscan.org", pageSize = 20, searchPageSize = 10)
