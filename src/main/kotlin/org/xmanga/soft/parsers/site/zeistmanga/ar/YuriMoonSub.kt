package org.xmanga.soft.parsers.site.zeistmanga.ar

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("YURIMOONSUB", "Yurimoonsub.blogspot.com", "ar")
internal class YuriMoonSub(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.YURIMOONSUB, "yurimoonsub.blogspot.com")
