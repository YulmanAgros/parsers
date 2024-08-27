package org.xmanga.soft.parsers.site.madara.pt

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("ILLUSIONSCAN", "IllusionScan", "pt", ContentType.HENTAI)
internal class IllusionScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ILLUSIONSCAN, "illusionscan.com") {
	override val datePattern: String = "dd 'de' MMMMM 'de' yyyy"
}
