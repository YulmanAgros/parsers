package org.xmanga.soft.parsers.site.madara.pt

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("LEITORKAMISAMA", "LeitorKamisama", "pt")
internal class LeitorKamisama(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LEITORKAMISAMA, "leitor.kamisama.com.br", 10) {
	override val datePattern: String = "dd 'de' MMMMM 'de' yyyy"
}
