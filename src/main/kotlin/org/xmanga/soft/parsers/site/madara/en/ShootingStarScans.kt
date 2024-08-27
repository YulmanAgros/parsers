package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("SHOOTINGSTARSCANS", "Shooting Star Scans", "en")
internal class ShootingStarScans(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.SHOOTINGSTARSCANS, "shootingstarscans.com") {
	override val tagPrefix = "manga-tag/"
}
