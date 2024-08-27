package org.xmanga.soft.parsers.site.otakusanctuary.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.otakusanctuary.OtakuSanctuaryParser

@MangaSourceParser("OTAKUSAN_EN", "OtakuSan-En", "en")
internal class OtakusanEn(context: MangaLoaderContext) :
	OtakuSanctuaryParser(context, MangaParserSource.OTAKUSAN_EN, "otakusan.net") {
	override val lang = "us"
	override val selectState = ".table-info tr:contains(Status) td"
}
