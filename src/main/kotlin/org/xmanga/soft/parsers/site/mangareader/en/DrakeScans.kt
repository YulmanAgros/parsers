package org.xmanga.soft.parsers.site.mangareader.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("DRAKESCANS", "DrakeComic", "en")
internal class DrakeScans(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.DRAKESCANS, "drakecomic.com", 20, 10)
