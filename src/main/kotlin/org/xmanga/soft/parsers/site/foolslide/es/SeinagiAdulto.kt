package org.xmanga.soft.parsers.site.foolslide.es

import kotlinx.coroutines.coroutineScope
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.Manga
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.foolslide.FoolSlideParser
import org.xmanga.soft.parsers.util.*

@MangaSourceParser("SEINAGIADULTO", "Seinagi Adulto", "es", ContentType.HENTAI)
internal class SeinagiAdulto(context: MangaLoaderContext) :
	FoolSlideParser(context, MangaParserSource.SEINAGIADULTO, "adulto.seinagi.org.es") {

	override suspend fun getDetails(manga: Manga): Manga = coroutineScope {
		val fullUrl = manga.url.toAbsoluteUrl(domain)
		val testAdultPage = webClient.httpGet(fullUrl).parseHtml()
		val doc = if (testAdultPage.selectFirst("div.info form") != null) {
			webClient.httpPost(fullUrl, "adult=true").parseHtml()
		} else {
			testAdultPage
		}
		val chapters = getChapters(doc)
		val desc = if (doc.selectFirstOrThrow(selectInfo).html().contains("Descripción")) {
			doc.selectFirstOrThrow(selectInfo).text().substringAfter("Descripción: ").substringBefore("Lecturas")
		} else {
			doc.selectFirstOrThrow(selectInfo).text()
		}
		val author = if (doc.selectFirstOrThrow(selectInfo).html().contains("Author")) {
			doc.selectFirstOrThrow(selectInfo).text().substringAfter("Author: ").substringBefore("Art")
		} else {
			null
		}
		manga.copy(
			coverUrl = doc.selectFirst(".thumbnail img")?.src().orEmpty(),// for manga result on search
			description = desc,
			altTitle = null,
			author = author,
			state = null,
			chapters = chapters,
		)
	}
}
