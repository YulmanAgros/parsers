package org.xmanga.soft.parsers.site.ru.multichan

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.config.ConfigKey
import org.xmanga.soft.parsers.model.MangaParserSource

@MangaSourceParser("MANGACHAN", "Манга-тян", "ru")
internal class MangaChanParser(context: MangaLoaderContext) : ChanParser(context, MangaParserSource.MANGACHAN) {
	override val configKeyDomain = ConfigKey.Domain("manga-chan.me")
}
