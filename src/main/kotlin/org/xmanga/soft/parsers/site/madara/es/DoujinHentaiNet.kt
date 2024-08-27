package org.xmanga.soft.parsers.site.madara.es

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaChapter
import org.xmanga.soft.parsers.model.MangaPage
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser
import org.xmanga.soft.parsers.util.*
import java.util.*

@MangaSourceParser("DOUJIN_HENTAI_NET", "DoujinHentai.net", "es", ContentType.HENTAI)
internal class DoujinHentaiNet(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.DOUJIN_HENTAI_NET, "doujinhentai.net", 18) {

	override val datePattern = "dd MMM. yyyy"
	override val sourceLocale: Locale = Locale.ENGLISH
	override val listUrl = "lista-manga-hentai/"
	override val tagPrefix = "lista-manga-hentai/category/"
	override val selectTestAsync = "div.listing-chapters_wrap"
	override val selectChapter = "li.wp-manga-chapter:contains(Capitulo)"
	override val selectPage = "div#all img"

	override suspend fun getPages(chapter: MangaChapter): List<MangaPage> {
		val fullUrl = chapter.url.toAbsoluteUrl(domain)
		val doc = webClient.httpGet(fullUrl).parseHtml()
		return doc.select(selectPage).map { div ->
			val img = div.selectFirstOrThrow("img")
			val url = img.src()?.toRelativeUrl(domain) ?: div.parseFailed("Image src not found")
			MangaPage(
				id = generateUid(url),
				url = url,
				preview = null,
				source = source,
			)
		}
	}
}
