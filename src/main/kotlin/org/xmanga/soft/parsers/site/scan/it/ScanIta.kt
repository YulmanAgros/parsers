package org.xmanga.soft.parsers.site.scan.it

import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import org.jsoup.nodes.Document
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.Manga
import org.xmanga.soft.parsers.model.MangaChapter
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.model.RATING_UNKNOWN
import org.xmanga.soft.parsers.site.scan.ScanParser
import org.xmanga.soft.parsers.util.*
import java.text.SimpleDateFormat

@MangaSourceParser("SCANITA", "ScanIta.org", "it")
internal class ScanIta(context: MangaLoaderContext) :
	ScanParser(context, MangaParserSource.SCANITA, "scanita.org") {

	override suspend fun getDetails(manga: Manga): Manga = coroutineScope {
		val doc = webClient.httpGet(manga.url.toAbsoluteUrl(domain)).parseHtml()
		val tagMap = getOrCreateTagMap()
		val selectTag = doc.select(".card-series-detail .col-6:contains(Categorie) div")
		val tags = selectTag.mapNotNullToSet { tagMap[it.text()] }
		val chaptersDeferred = async { loadChapters(doc) }
		manga.copy(
			rating = doc.selectFirst(".card-series-detail .rate-value span")?.ownText()?.toFloatOrNull()?.div(5f)
				?: RATING_UNKNOWN,
			tags = tags,
			author = doc.selectFirst(".card-series-detail .col-6:contains(Autore) div")?.text(),
			altTitle = doc.selectFirst(".card div.col-12.mb-4 h2")?.text().orEmpty(),
			description = doc.selectFirst(".card div.col-12.mb-4 p")?.html().orEmpty(),
			chapters = chaptersDeferred.await(),
		)
	}

	private suspend fun loadChapters(document: Document): List<MangaChapter> {
		val id = document.selectFirstOrThrow(".container-fluid button.w-100").attr("data-path")
			.substringAfter("/manga/").substringBefore("/books")
		val url = "https://$domain/manga/$id/books"
		val doc = webClient.httpGet(url).parseHtml()
		val dateFormat = SimpleDateFormat("MM-dd-yyyy", sourceLocale)
		return doc.select(".chapters-list .col-chapter").mapChapters(reversed = true) { i, div ->
			val href = div.selectFirstOrThrow("a").attrAsRelativeUrl("href")
			MangaChapter(
				id = generateUid(href),
				name = div.selectFirstOrThrow("h5").html().substringBefore("<div").substringAfter("</span>"),
				number = i + 1f,
				volume = 0,
				url = href,
				scanlator = null,
				uploadDate = dateFormat.tryParse(doc.selectFirstOrThrow("h5 div").text()),
				branch = null,
				source = source,
			)
		}
	}
}
