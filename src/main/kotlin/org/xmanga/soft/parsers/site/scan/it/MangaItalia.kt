package org.xmanga.soft.parsers.site.scan.it

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.scan.ScanParser

@MangaSourceParser("MANGAITALIA", "MangaItalia", "pt")
internal class MangaItalia(context: MangaLoaderContext) :
	ScanParser(context, MangaParserSource.MANGAITALIA, "manga-italia.com")
