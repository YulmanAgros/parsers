package org.xmanga.soft.parsers.site.madara.tr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("MINDAFANSUB", "MindaFansub", "tr", ContentType.HENTAI)
internal class MindaFansub(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MINDAFANSUB, "mindafansub.online")
