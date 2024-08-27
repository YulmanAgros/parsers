package org.xmanga.soft.parsers.site.zeistmanga.pt

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("TYRANTSCANS", "TyrantScans", "pt")
internal class TyrantScans(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.TYRANTSCANS, "www.tyrantscans.com")
