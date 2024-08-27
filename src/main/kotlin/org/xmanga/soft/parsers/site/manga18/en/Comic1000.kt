package org.xmanga.soft.parsers.site.manga18.en

import org.xmanga.soft.parsers.Broken
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.manga18.Manga18Parser

@Broken
@MangaSourceParser("COMIC1000", "Comic1000", "en")
internal class Comic1000(context: MangaLoaderContext) :
	Manga18Parser(context, MangaParserSource.COMIC1000, "comic1000.com")
