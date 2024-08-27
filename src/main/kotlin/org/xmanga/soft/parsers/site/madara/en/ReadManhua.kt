package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.Broken
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("READMANHUA", "ReadManhua", "en", ContentType.HENTAI)
internal class ReadManhua(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.READMANHUA, "readmanhua.net", 20) {
	override val postReq = true
	override val datePattern = "d MMM yy"
}
