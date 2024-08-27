package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("BABELWUXIA", "Babelwuxia", "en")
internal class Babelwuxia(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.BABELWUXIA, "babelwuxia.com")
