package org.xmanga.soft.parsers.site.mangareader.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MANGAGOJO", "MangaGojo", "en")
internal class MangaGojo(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MANGAGOJO, "mangagojo.com", 30, 20)
