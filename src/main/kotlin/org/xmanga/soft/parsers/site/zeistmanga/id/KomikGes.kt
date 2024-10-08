package org.xmanga.soft.parsers.site.zeistmanga.id

import org.jsoup.nodes.Document
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaChapter
import org.xmanga.soft.parsers.model.MangaPage
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.zeistmanga.ZeistMangaParser
import org.xmanga.soft.parsers.util.*
import org.xmanga.soft.parsers.util.json.toJSONList
import java.text.SimpleDateFormat

@MangaSourceParser("KOMIKGES", "KomikGes", "id")
internal class KomikGes(context: MangaLoaderContext) :
	ZeistMangaParser(context, MangaParserSource.KOMIKGES, "www.komikges.my.id") {

	override suspend fun loadChapters(mangaUrl: String, doc: Document): List<MangaChapter> {
		val feed = doc.selectFirstOrThrow(".episode-list script").html().substringAfter("('").substringBefore("');")
		val url = buildString {
			append("https://")
			append(domain)
			append("/feeds/posts/default/-/")
			append(feed)
			append("?alt=json&orderby=published&max-results=9999")
		}
		val json =
			webClient.httpGet(url).parseJson().getJSONObject("feed").getJSONArray("entry").toJSONList().reversed()
		val dateFormat = SimpleDateFormat(datePattern, sourceLocale)
		return json.mapIndexedNotNull { i, j ->
			val name = j.getJSONObject("title").getString("\$t")
			val href =
				j.getJSONArray("link").toJSONList().first { it.getString("rel") == "alternate" }.getString("href")
			val dateText = j.getJSONObject("published").getString("\$t").substringBefore("T")
			val slug = mangaUrl.substringAfterLast('/')
			val slugChapter = href.substringAfterLast('/')
			if (slug == slugChapter) {
				return@mapIndexedNotNull null
			}
			MangaChapter(
				id = generateUid(href),
				url = href,
				name = name,
				number = i + 1f,
				volume = 0,
				branch = null,
				uploadDate = dateFormat.tryParse(dateText),
				scanlator = null,
				source = source,
			)
		}
	}

	override suspend fun getPages(chapter: MangaChapter): List<MangaPage> {
		val doc = webClient.httpGet(chapter.url.toAbsoluteUrl(domain)).parseHtml()
		return doc.selectFirstOrThrow("script:containsData(let data_content =)").data()
			.split("src\\x3d\\x22").drop(1)
			.map { img ->
				val url = img.substringBefore("\\x22")
				MangaPage(
					id = generateUid(url),
					url = url,
					preview = null,
					source = source,
				)
			}
	}
}
