package org.xmanga.soft.parsers.site.madara.tr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("ALLIED_FANSUB", "AlliedFansub", "tr", ContentType.HENTAI)
internal class AlliedFansub(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ALLIED_FANSUB, "alliedfansub.net", 20) {
	override val datePattern = "dd/MM/yyyy"
}
