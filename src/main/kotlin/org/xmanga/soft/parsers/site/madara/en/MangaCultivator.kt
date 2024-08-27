package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.Broken
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("MANGACULTIVATOR", "MangaCultivator", "en")
internal class MangaCultivator(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGACULTIVATOR, "mangacultivator.com", 10)
