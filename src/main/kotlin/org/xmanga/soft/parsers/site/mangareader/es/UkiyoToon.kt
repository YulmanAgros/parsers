package org.xmanga.soft.parsers.site.mangareader.es

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("UKIYOTOON", "UkiyoToon", "es")
internal class UkiyoToon(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.UKIYOTOON, "ukiyotoon.com", 30, 10) {
	override val isTagsExclusionSupported = false
}
