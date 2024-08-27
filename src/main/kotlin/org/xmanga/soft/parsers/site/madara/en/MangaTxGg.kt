package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGATX_GG", "MangaTx.gg", "en")
internal class MangaTxGg(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGATX_GG, "mangatx.gg")
