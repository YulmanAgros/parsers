package org.xmanga.soft.parsers.site.mangareader.fr

import org.xmanga.soft.parsers.Broken
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser

@Broken
@MangaSourceParser("BANANASCAN", "BananaScan", "fr")
internal class BananaScan(context: MangaLoaderContext) :
	MangaReaderParser(context, MangaParserSource.BANANASCAN, "banana-scan.com", pageSize = 20, searchPageSize = 20) {
	override val datePattern = "MMM d, yyyy"
}
