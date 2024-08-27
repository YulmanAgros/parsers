package org.xmanga.soft.parsers.site.scan.pt

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.scan.ScanParser

@MangaSourceParser("MANGATERRA", "MangaTerra", "pt")
internal class MangaTerra(context: MangaLoaderContext) :
	ScanParser(context, MangaParserSource.MANGATERRA, "manga-terra.com")
