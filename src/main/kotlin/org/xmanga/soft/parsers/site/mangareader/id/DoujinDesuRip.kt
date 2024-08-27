package org.xmanga.soft.parsers.site.mangareader.id

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("DOUJINDESURIP", "DoujinDesu.click", "id", ContentType.HENTAI)
internal class DoujinDesuRip(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.DOUJINDESURIP,
		"doujindesu.click",
		pageSize = 20,
		searchPageSize = 10,
	) {
	override val isTagsExclusionSupported = false
}
