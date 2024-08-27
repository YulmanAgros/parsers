package org.xmanga.soft.parsers.site.zeistmanga.ar

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("YOKAITEAM", "YokaiTeam", "ar")
internal class YokaiTeam(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.YOKAITEAM, "yokai-team.blogspot.com")
