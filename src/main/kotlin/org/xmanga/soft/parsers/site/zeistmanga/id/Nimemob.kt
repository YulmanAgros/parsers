package org.xmanga.soft.parsers.site.zeistmanga.id

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("NIMEMOB", "Nimemob", "id")
internal class Nimemob(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.NIMEMOB, "www.nimemob.my.id")
