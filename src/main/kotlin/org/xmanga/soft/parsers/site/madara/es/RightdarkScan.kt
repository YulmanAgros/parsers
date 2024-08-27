package org.xmanga.soft.parsers.site.madara.es

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("RIGHTDARKSCAN", "RightDarkScan", "es")
internal class RightdarkScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.RIGHTDARKSCAN, "rsdleft.com", 10)
