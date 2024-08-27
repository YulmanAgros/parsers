package org.xmanga.soft.parsers.site.mangareader.id

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("MANHWALAND_INK", "ManhwaLand.ink", "id", ContentType.HENTAI)
internal class ManhwaLandInk(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.MANHWALAND_INK,
		"www.manhwaland.ink",
		pageSize = 20,
		searchPageSize = 10,
	) {
	override val isTagsExclusionSupported = false
	override val datePattern = "MMM d, yyyy"
}
