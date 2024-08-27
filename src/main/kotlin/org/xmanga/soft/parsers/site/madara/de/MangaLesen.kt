package org.xmanga.soft.parsers.site.madara.de

import org.xmanga.soft.parsers.Broken
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("MANGALESEN", "MangaLesen", "de")
internal class MangaLesen(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGALESEN, "mangalesen.net")
