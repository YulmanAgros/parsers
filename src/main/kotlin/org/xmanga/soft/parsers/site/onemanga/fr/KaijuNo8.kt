package org.xmanga.soft.parsers.site.onemanga.fr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.onemanga.OneMangaParser

@MangaSourceParser("KAIJUNO8", "KaijuNo8", "fr")
internal class KaijuNo8(context: MangaLoaderContext) :
	OneMangaParser(context, MangaParserSource.KAIJUNO8, "kaijuno8.fr")
