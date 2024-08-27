package org.xmanga.soft.parsers.site.otakusanctuary.vi

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.otakusanctuary.OtakuSanctuaryParser

@MangaSourceParser("OTAKUSAN_VI", "OtakuSan-Vi", "vi")
internal class OtakusanVi(context: MangaLoaderContext) :
	OtakuSanctuaryParser(context, MangaParserSource.OTAKUSAN_VI, "otakusan.net") {
	override val selectState = ".table-info tr:contains(Status) td"
	override val lang = "vn"
}
