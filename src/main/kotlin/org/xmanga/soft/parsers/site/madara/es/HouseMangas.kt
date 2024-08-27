package org.xmanga.soft.parsers.site.madara.es

import org.xmanga.soft.parsers.Broken
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("HOUSEMANGAS", "HouseMangas", "es")
internal class HouseMangas(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.HOUSEMANGAS, "housemangas.com")
