package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("GRABBER", "Grabber", "en", ContentType.COMICS)
internal class Grabber(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.GRABBER, "grabber.zone", 20) {
	override val tagPrefix = "type/"
	override val listUrl = "comics/"
	override val datePattern = "dd.MM.yyyy"
}
