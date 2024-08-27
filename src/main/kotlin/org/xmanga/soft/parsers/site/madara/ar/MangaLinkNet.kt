package org.xmanga.soft.parsers.site.madara.ar

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGALINKNET", "Link-Manga.com", "ar")
internal class MangaLinkNet(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGALINKNET, "link-manga.com", pageSize = 10)
