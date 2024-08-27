package org.xmanga.soft.parsers.site.mangareader.es

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("CARTELDEMANHWAS", "Cartel De Manhwas", "es")
internal class CartelDeManhwas(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.CARTELDEMANHWAS,
		"carteldemanhwas.com",
		pageSize = 20,
		searchPageSize = 20,
	) {
	override val listUrl = "/series"
	override val datePattern = "MMM d, yyyy"
}
