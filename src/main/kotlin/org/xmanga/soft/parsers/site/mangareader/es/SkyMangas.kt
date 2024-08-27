package org.xmanga.soft.parsers.site.mangareader.es

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("SKYMANGAS", "SkyMangas", "es")
internal class SkyMangas(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.SKYMANGAS, "skymangas.com", pageSize = 20, searchPageSize = 10) {
	override val encodedSrc = true
	override val isTagsExclusionSupported = false
}
