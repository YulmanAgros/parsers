package org.xmanga.soft.parsers.site.mangareader.id

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("KIRYUU", "Kiryuu", "id")
internal class KiryuuParser(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.KIRYUU, "kiryuu.org", pageSize = 30, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
}
