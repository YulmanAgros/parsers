package org.xmanga.soft.parsers.site.mangareader.tr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("ARCURAFANSUB", "ArcuraFansub", "tr", ContentType.HENTAI)
internal class ArcuraFansub(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.ARCURAFANSUB, "arcurafansub.com", pageSize = 20, searchPageSize = 10) {
	override val listUrl = "/seri"
	override val isTagsExclusionSupported = false
}
