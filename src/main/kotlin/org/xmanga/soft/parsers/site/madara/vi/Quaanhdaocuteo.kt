package org.xmanga.soft.parsers.site.madara.vi

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaChapter
import org.xmanga.soft.parsers.model.MangaPage
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser
import org.xmanga.soft.parsers.util.*

@MangaSourceParser("QUAANHDAOCUTEO", "Quaanhdaocuteo", "vi", ContentType.HENTAI)
internal class Quaanhdaocuteo(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.QUAANHDAOCUTEO, "qadc.top") {
	override val datePattern = "dd/MM/yyyy"
	override val selectPage = "p img"

	override suspend fun getPages(chapter: MangaChapter): List<MangaPage> {
		val fullUrl = chapter.url.toAbsoluteUrl(domain)
		val doc = webClient.httpGet(fullUrl).parseHtml()
		val root = doc.body().selectFirstOrThrow(selectBodyPage)
		return root.select(selectPage).map { img ->
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
