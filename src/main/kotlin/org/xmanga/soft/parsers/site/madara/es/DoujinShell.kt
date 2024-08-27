package org.xmanga.soft.parsers.site.madara.es

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("DOUJINSHELL", "DoujinShell", "es", ContentType.HENTAI)
internal class DoujinShell(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.DOUJINSHELL, "www.doujinshell.com", 10) {
	override val datePattern = "dd MMMM, yyyy"
	override val listUrl = "/doujin"
	override val tagPrefix = "/doujin-genero"
	override val selectPage = "img:not(.aligncenter)"
}
