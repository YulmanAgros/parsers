package org.xmanga.soft.parsers.site.mangareader.th

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("SODSAIME", "สดใสเมะ", "th")
internal class Sodsaime(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.SODSAIME,
		"www.xn--l3c0azab5a2gta.com",
		pageSize = 40,
		searchPageSize = 10,
	) {
	override val isTagsExclusionSupported = false
}
