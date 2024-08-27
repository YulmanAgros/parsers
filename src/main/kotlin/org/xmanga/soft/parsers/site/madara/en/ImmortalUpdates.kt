package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.Broken
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@Broken // Redirect to @MortalsGroove
@MangaSourceParser("IMMORTALUPDATES", "ImmortalUpdates", "en")
internal class ImmortalUpdates(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.IMMORTALUPDATES, "immortalupdates.com") {
	override val listUrl = "mangas/"
}
