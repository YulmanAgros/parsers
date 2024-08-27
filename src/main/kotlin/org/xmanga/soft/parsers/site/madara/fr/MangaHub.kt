package org.xmanga.soft.parsers.site.madara.fr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("MANGAHUB", "MangaHub", "fr", ContentType.HENTAI)
internal class MangaHub(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGAHUB, "mangahub.fr") {
	override val datePattern = "d MMMM yyyy"
}
