package org.xmanga.soft.parsers.site.mangareader.tr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@MangaSourceParser("TEMPESTFANSUBNET", "TempestFansub.net", "tr")
internal class TempestFansubNet(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.TEMPESTFANSUBNET,
		"tempestfansub.net",
		pageSize = 30,
		searchPageSize = 10,
	)
