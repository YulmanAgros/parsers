package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAMANIACS", "MangaManiacs", "en", ContentType.HENTAI)
internal class MangaManiacs(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAMANIACS, "mangamaniacs.org", 10)
