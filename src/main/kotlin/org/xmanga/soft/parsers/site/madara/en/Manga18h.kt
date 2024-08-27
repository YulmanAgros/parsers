package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.Broken
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@Broken // Redirect to @hentai20
@MangaSourceParser("MANGA18H", "Manga18h", "en", ContentType.HENTAI)
internal class Manga18h(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGA18H, "manga18h.xyz", 20)
