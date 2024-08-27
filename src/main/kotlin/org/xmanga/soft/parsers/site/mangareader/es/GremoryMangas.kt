package org.xmanga.soft.parsers.site.mangareader.es

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("GREMORYMANGAS", "GremoryMangas", "es")
internal class GremoryMangas(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.GREMORYMANGAS,
		"gremorymangas.com",
		pageSize = 20,
		searchPageSize = 20,
	) {
	override val isTagsExclusionSupported = false
}
