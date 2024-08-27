package org.xmanga.soft.parsers.site.mmrcms.fr

import org.xmanga.soft.parsers.Broken
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mmrcms.MmrcmsParser
import java.util.*

@Broken
@MangaSourceParser("JPMANGAS", "JpMangas", "fr")
internal class JpMangas(context: MangaLoaderContext) :
	MmrcmsParser(context, MangaParserSource.JPMANGAS, "jpmangas.xyz") {
	override val sourceLocale: Locale = Locale.ENGLISH
}
