package org.xmanga.soft.parsers.site.ru.rulib

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource

@MangaSourceParser("HENTAILIB", "HentaiLib", "ru", type = ContentType.HENTAI)
internal class HentaiLibParser(context: MangaLoaderContext) : LibSocialParser(
	context = context,
	source = MangaParserSource.HENTAILIB,
	siteId = 4,
	siteDomain = "hentailib.me",
)
