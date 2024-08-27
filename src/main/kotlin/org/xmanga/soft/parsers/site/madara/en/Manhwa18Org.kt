package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("MANHWA18ORG", "Manhwa18.org", "en", ContentType.HENTAI)
internal class Manhwa18Org(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANHWA18ORG, "manhwa18.org") {
	override val postReq = true
}
