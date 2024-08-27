package org.xmanga.soft.parsers.site.madara.tr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("IMPARATORMANGA", "ImparatorManga", "tr")
internal class ImparatorManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.IMPARATORMANGA, "www.imparatormanga.com")
