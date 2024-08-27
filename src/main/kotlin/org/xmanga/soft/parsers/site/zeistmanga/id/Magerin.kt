package org.xmanga.soft.parsers.site.zeistmanga.id

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.zeistmanga.ZeistMangaParser


@MangaSourceParser("MAGERIN", "Magerin", "id")
internal class Magerin(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.MAGERIN, "www.magerin.com")
