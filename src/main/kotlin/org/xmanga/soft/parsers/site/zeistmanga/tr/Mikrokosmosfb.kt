package org.xmanga.soft.parsers.site.zeistmanga.tr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.model.MangaTag
import org.xmanga.soft.parsers.site.zeistmanga.ZeistMangaParser
import org.xmanga.soft.parsers.util.domain
import org.xmanga.soft.parsers.util.mapNotNullToSet
import org.xmanga.soft.parsers.util.parseHtml
import org.xmanga.soft.parsers.util.selectFirstOrThrow

@MangaSourceParser("MIKROKOSMOSFB", "Mikrokosmosfb", "tr", ContentType.HENTAI)
internal class Mikrokosmosfb(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.MIKROKOSMOSFB, "mikrokosmosfb.blogspot.com") {
	override val sateOngoing: String = "Devam Ediyor"
	override val sateFinished: String = "Tamamlandı"
	override val sateAbandoned: String = "Güncel"

	override suspend fun getAvailableTags(): Set<MangaTag> {
		val doc = webClient.httpGet("https://$domain").parseHtml()
		val tags = doc.selectFirstOrThrow("script:containsData(label: )").data()
			.substringAfter("label: [").substringBefore("]").replace("\"", "").split(", ")
		return tags.mapNotNullToSet {
			MangaTag(
				key = it,
				title = it,
				source = source,
			)
		}
	}
}
