package org.xmanga.soft.parsers.site.mangareader.pt

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("SSSSCANLATOR", "SssScanlator", "pt")
internal class SssScanlator(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.SSSSCANLATOR,
		"sssscanlator.com.br",
		pageSize = 20,
		searchPageSize = 10,
	) {
	override val isTagsExclusionSupported = false
}
