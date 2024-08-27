package org.xmanga.soft.parsers.site.manga18.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.manga18.Manga18Parser

@MangaSourceParser("MANGA18", "Manga18", "en", ContentType.HENTAI)
internal class Manga18(context: MangaLoaderContext) :
	Manga18Parser(context, MangaParserSource.MANGA18, "manga18.club")
