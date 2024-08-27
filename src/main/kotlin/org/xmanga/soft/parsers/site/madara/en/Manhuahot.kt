package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("MANHUAHOT", "ManhuaHot", "en")
internal class Manhuahot(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANHUAHOT, "manhuahot.com", 10)
