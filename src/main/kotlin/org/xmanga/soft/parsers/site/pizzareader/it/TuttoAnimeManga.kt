package org.xmanga.soft.parsers.site.pizzareader.it

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.pizzareader.PizzaReaderParser

@MangaSourceParser("TUTTOANIMEMANGA", "TuttoAnimeManga", "it")
internal class TuttoAnimeManga(context: MangaLoaderContext) :
	PizzaReaderParser(context, MangaParserSource.TUTTOANIMEMANGA, "tuttoanimemanga.net") {
	override val completedFilter = "completato"
}
