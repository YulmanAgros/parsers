package org.xmanga.soft.parsers.site.mangareader.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("LUACOMIC_COM", "luaComic.com", "en")
internal class LuaComicCom(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.LUACOMIC_COM, "luacomic.com", pageSize = 20, searchPageSize = 10) {
	override val isTagsExclusionSupported = false
}
