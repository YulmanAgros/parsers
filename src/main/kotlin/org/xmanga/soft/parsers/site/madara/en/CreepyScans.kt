package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.Broken
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("CREEPYSCANS", "CreepyScans", "en")
internal class CreepyScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.CREEPYSCANS, "creepyscans.com") {
	override val stylePage = ""
}
