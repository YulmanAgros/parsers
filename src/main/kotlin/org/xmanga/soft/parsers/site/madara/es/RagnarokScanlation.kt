package org.xmanga.soft.parsers.site.madara.es

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("RAGNAROKSCANLATION", "RagnarokScanlation", "es")
internal class RagnarokScanlation(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.RAGNAROKSCANLATION, "ragnarokscanlation.net")
