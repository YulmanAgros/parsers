package org.xmanga.soft.parsers.site.madara.es

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("JOBSIBE", "Jobsibe", "es")
internal class Jobsibe(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.JOBSIBE, "jobsibe.com") {
	override val datePattern = "dd/MM"
}
