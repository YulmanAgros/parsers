package org.xmanga.soft.parsers.site.fmreader.ja

import org.jsoup.nodes.Document
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaChapter
import org.xmanga.soft.parsers.model.MangaPage
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.fmreader.FmreaderParser
import org.xmanga.soft.parsers.util.*
import java.text.SimpleDateFormat

@MangaSourceParser("WELOVEMANGA", "WeLoveManga", "ja")
internal class WeLoveManga(context: MangaLoaderContext) :
	FmreaderParser(context, MangaParserSource.WELOVEMANGA, "welovemanga.one") {

	override suspend fun getChapters(doc: Document): List<MangaChapter> {
		val mid = doc.selectFirstOrThrow("div.cmt input").attr("value")
		val docLoad =
			webClient.httpGet("https://$domain/app/manga/controllers/cont.Listchapter.php?mid=$mid").parseHtml()
		val dateFormat = SimpleDateFormat(datePattern, sourceLocale)
		return docLoad.body().select(selectChapter).mapChapters(reversed = true) { i, a ->
			val href = a.selectFirstOrThrow("a").attrAsRelativeUrl("href")
			val dateText = a.selectFirst(selectDate)?.text()
			MangaChapter(
				id = generateUid(href),
				name = a.selectFirstOrThrow("a").text(),
				number = i + 1f,
				volume = 0,
				url = href,
				uploadDate = parseChapterDate(
					dateFormat,
					dateText,
				),
				source = source,
				scanlator = null,
				branch = null,
			)
		}
	}

	override suspend fun getPages(chapter: MangaChapter): List<MangaPage> {
		val fullUrl = chapter.url.toAbsoluteUrl(domain)
		val doc = webClient.httpGet(fullUrl).parseHtml()
		val cid = doc.selectFirstOrThrow("#chapter").attr("value")
		val docLoad = webClient.httpGet("https://$domain/app/manga/controllers/cont.listImg.php?cid=$cid").parseHtml()
		return docLoad.select("img").map { img ->
			val url = img.src()?.toRelativeUrl(domain) ?: img.parseFailed("Image src not found")

			MangaPage(
				id = generateUid(url),
				url = url,
				preview = null,
				source = source,
			)
		}
	}
}
