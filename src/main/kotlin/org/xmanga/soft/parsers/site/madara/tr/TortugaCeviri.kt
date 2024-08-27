package org.xmanga.soft.parsers.site.madara.tr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("TORTUGACEVIRI", "TortugaCeviri", "tr")
internal class TortugaCeviri(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.TORTUGACEVIRI, "tortuga-ceviri.com")
