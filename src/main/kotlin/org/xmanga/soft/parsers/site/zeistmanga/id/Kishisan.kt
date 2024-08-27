package org.xmanga.soft.parsers.site.zeistmanga.id

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("KISHISAN", "Kishisan", "id")
internal class Kishisan(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.KISHISAN, "www.kishisan.site")
