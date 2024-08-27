package org.xmanga.soft.parsers.site.onemanga.fr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.onemanga.OneMangaParser

@MangaSourceParser("SAKAMOTODAYS", "SakamotoDays", "fr")
internal class SakamotoDays(context: MangaLoaderContext) :
	OneMangaParser(context, MangaParserSource.SAKAMOTODAYS, "sakamotodays.fr")
