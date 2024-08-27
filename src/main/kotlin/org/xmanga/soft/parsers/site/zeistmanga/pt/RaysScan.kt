package org.xmanga.soft.parsers.site.zeistmanga.pt

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.model.MangaState
import org.xmanga.soft.parsers.model.MangaTag
import org.xmanga.soft.parsers.site.zeistmanga.ZeistMangaParser

@MangaSourceParser("RAYSSCAN", "RaysScan", "pt")
internal class RaysScan(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.RAYSSCAN, "raysscan.blogspot.com") {
	override val availableStates: Set<MangaState> = emptySet()
	override suspend fun getAvailableTags(): Set<MangaTag> = emptySet()
}


