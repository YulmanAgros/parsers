package org.xmanga.soft.parsers.site.madara.pt

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("CRYSTALSCAN", "CrystalComics", "pt")
internal class CrystalScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.CRYSTALSCAN, "crystalcomics.com")

