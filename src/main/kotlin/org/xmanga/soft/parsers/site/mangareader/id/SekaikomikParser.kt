package org.xmanga.soft.parsers.site.mangareader.id

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("SEKAIKOMIK", "SekaiKomik", "id")
internal class SekaikomikParser(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.SEKAIKOMIK, "sekaikomik.guru", pageSize = 20, searchPageSize = 100) {
	override val isTagsExclusionSupported = false
}
