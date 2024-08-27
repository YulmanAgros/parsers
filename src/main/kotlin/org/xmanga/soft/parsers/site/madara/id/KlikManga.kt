package org.xmanga.soft.parsers.site.madara.id

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("KLIKMANGA", "KlikManga", "id", ContentType.HENTAI)
internal class KlikManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.KLIKMANGA, "klikmanga.id", 36) {
	override val tagPrefix = "genre/"
	override val datePattern = "MMM d, yyyy"
}
