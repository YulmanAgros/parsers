package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("ARYASCANS", "AryaScans", "en")
internal class AryaScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ARYASCANS, "aryascans.com")
