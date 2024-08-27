package org.xmanga.soft.parsers.site.madara.fr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("HARMONYSCAN", "HarmonyScan", "fr")
internal class HarmonyScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.HARMONYSCAN, "harmony-scan.fr")
