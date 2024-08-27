package org.xmanga.soft.parsers.site.madara.fr

import org.xmanga.soft.parsers.Broken
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("SCANTRADVF", "Scantrad-Vf", "fr")
internal class ScantradVf(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.SCANTRADVF, "scantrad-vf.me") {
	override val datePattern = "d MMMM yyyy"
	override val tagPrefix = "genre/"
}
