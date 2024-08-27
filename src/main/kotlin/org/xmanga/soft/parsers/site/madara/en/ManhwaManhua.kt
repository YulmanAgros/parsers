package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("MANHWAMANHUA", "ManhwaManhua", "en")
internal class ManhwaManhua(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANHWAMANHUA, "manhwamanhua.com")
