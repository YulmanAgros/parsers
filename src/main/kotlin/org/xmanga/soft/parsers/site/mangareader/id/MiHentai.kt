package org.xmanga.soft.parsers.site.mangareader.id

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MIHENTAI", "MiHentai", "id", ContentType.HENTAI)
internal class MiHentai(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.MIHENTAI, "mihentai.com", pageSize = 30, searchPageSize = 10) {
	override val datePattern = "MMM d, yyyy"
	override val isTagsExclusionSupported = false
}
