package org.xmanga.soft.parsers.site.mmrcms.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mmrcms.MmrcmsParser

@MangaSourceParser("READCOMICSONLINE", "ReadComicsOnline.ru", "en", ContentType.COMICS)
internal class ReadComicsOnline(context: MangaLoaderContext) :
	MmrcmsParser(context, MangaParserSource.READCOMICSONLINE, "readcomicsonline.ru") {
	override val selectState = "dt:contains(Status)"
	override val selectTag = "dt:contains(Categories)"
}
