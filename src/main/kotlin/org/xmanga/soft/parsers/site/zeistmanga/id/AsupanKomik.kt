package org.xmanga.soft.parsers.site.zeistmanga.id

import org.xmanga.soft.parsers.Broken
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.zeistmanga.ZeistMangaParser

@Broken
@MangaSourceParser("ASUPANKOMIK", "AsupanKomik", "id")
internal class AsupanKomik(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.ASUPANKOMIK, "www.asupankomik.my.id")
