package org.xmanga.soft.parsers.site.mangareader.id

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("DOUJINKU", "DoujinKu", "id", ContentType.HENTAI)
internal class DoujinKu(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.DOUJINKU, "doujinku.xyz", pageSize = 20, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
}
