package org.xmanga.soft.parsers.site.mangareader.es

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("SENPAIEDICIONES", "SenpaiEdiciones", "es")
internal class Senpaiediciones(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.SENPAIEDICIONES,
		"senpaiediciones.com",
		pageSize = 20,
		searchPageSize = 20,
	) {
	override val datePattern = "MMM d, yyyy"
}
