package org.xmanga.soft.parsers.site.madara.pt

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("SUSSYSCAN", "SussyScan", "pt")
internal class SussyScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.SUSSYSCAN, "oldi.sussytoons.com")
