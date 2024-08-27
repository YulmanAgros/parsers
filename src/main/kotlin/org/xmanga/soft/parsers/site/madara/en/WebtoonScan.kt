package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("WEBTOONSCAN", "WebtoonScan", "en", ContentType.HENTAI)
internal class WebtoonScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.WEBTOONSCAN, "webtoonscan.com", 20)
