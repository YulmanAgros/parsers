package org.xmanga.soft.parsers.site.madara.ar

import org.xmanga.soft.parsers.Broken
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("MANGASPARK", "Manga-Spark", "ar")
internal class Mangaspark(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGASPARK, "manga-spark.com", pageSize = 10) {
	override val postReq = true
	override val datePattern = "d MMMM، yyyy"
}
