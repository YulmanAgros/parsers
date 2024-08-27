package org.xmanga.soft.parsers.site.keyoapp.fr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.keyoapp.KeyoappParser

@MangaSourceParser("ANTEIKUSCAN", "AnteikuScan", "fr")
internal class AnteikuScan(context: MangaLoaderContext) :
	KeyoappParser(context, MangaParserSource.ANTEIKUSCAN, "anteikuscan.fr")
