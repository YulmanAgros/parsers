package org.xmanga.soft.parsers.site.mangareader.id

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("KOMIKTAP", "KomikTap", "id", ContentType.HENTAI)
internal class KomikTapParser(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.KOMIKTAP, "komiktap.info", pageSize = 25, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
}
