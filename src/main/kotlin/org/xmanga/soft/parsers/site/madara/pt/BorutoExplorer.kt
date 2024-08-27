package org.xmanga.soft.parsers.site.madara.pt

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("BORUTOEXPLORER", "BorutoExplorer", "pt")
internal class BorutoExplorer(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.BORUTOEXPLORER, "leitor.borutoexplorer.com.br", 10) {
	override val datePattern: String = "dd 'de' MMMMM 'de' yyyy"
}
