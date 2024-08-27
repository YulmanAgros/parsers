package org.xmanga.soft.parsers.site.madara.pt

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("CVNSCAN", "CvnScan", "pt", ContentType.HENTAI)
internal class CvnScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.CVNSCAN, "cvnscan.com")
