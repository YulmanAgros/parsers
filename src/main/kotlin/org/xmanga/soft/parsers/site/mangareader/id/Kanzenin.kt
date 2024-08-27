package org.xmanga.soft.parsers.site.mangareader.id

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("KANZENIN", "Kanzenin", "id", ContentType.HENTAI)
internal class Kanzenin(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.KANZENIN, "kanzenin.info", pageSize = 27, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
}
