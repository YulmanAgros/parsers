package org.xmanga.soft.parsers.site.madara.id

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser
import java.util.Locale

@MangaSourceParser("YURAMANGA", "YuraManga", "id")
internal class YuraManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.YURAMANGA, "yuramanga.my.id") {
	override val sourceLocale: Locale = Locale.ENGLISH
}
