package org.xmanga.soft.parsers.site.mmrcms.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mmrcms.MmrcmsParser

@MangaSourceParser("BANANASCAN_COM", "BananaScan.Com", "en")
internal class BananaScan(context: MangaLoaderContext) :
	MmrcmsParser(context, MangaParserSource.BANANASCAN_COM, "bananascans.com")
