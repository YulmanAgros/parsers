package org.xmanga.soft.parsers.site.mangareader.es

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("DOUJINS", "Doujins.lat", "es", ContentType.HENTAI)
internal class Doujins(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.DOUJINS, "doujins.lat", pageSize = 20, searchPageSize = 10) {
	override val listUrl = "/comic"
	override val isTagsExclusionSupported = false
}
