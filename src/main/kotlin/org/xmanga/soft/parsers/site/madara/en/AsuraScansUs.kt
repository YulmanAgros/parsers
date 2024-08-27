package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("ASURASCANS_US", "AsuraScans.us", "en")
internal class AsuraScansUs(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ASURASCANS_US, "asurascans.us") {
	override val listUrl = "comics/"
	override val tagPrefix = "read-en-us-genre/"
}
