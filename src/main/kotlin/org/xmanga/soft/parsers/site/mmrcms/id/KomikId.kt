package org.xmanga.soft.parsers.site.mmrcms.id

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mmrcms.MmrcmsParser
import java.util.*

@MangaSourceParser("KOMIKID", "KomikId", "id")
internal class KomikId(context: MangaLoaderContext) :
	MmrcmsParser(context, MangaParserSource.KOMIKID, "komikid.com") {
	override val selectState = "dt:contains(Status)"
	override val selectAlt = "dt:contains(Other names)"
	override val selectAut = "dt:contains(Author(s))"
	override val selectTag = "dt:contains(Categories)"
	override val sourceLocale: Locale = Locale.ENGLISH
}
