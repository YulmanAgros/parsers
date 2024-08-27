package org.xmanga.soft.parsers.site.madara.id

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("YUBIKIRI", "Yubikiri", "id")
internal class Yubikiri(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.YUBIKIRI, "yubikiri.my.id", 18) {
	override val tagPrefix = "genre/"
	override val datePattern = "d MMMM"
}
