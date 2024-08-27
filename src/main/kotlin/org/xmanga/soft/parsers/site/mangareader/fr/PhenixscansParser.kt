package org.xmanga.soft.parsers.site.mangareader.fr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("PHENIXSCANS", "PhenixScans", "fr")
internal class PhenixscansParser(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.PHENIXSCANS, "phenixscans.fr", pageSize = 20, searchPageSize = 10) {
	override val datePattern = "MMM d, yyyy"
	override val isTagsExclusionSupported = false
}
