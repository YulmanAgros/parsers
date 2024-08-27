package org.xmanga.soft.parsers.site.madara.en

import org.jsoup.nodes.Document
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.Manga
import org.xmanga.soft.parsers.model.MangaChapter
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser
import org.xmanga.soft.parsers.util.*
import java.text.SimpleDateFormat
import java.util.*

@MangaSourceParser("MANGA_DISTRICT", "MangaDistrict", "en", ContentType.HENTAI)
internal class MangaDistrict(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANGA_DISTRICT, "mangadistrict.com", pageSize = 30) {

	override val tagPrefix = "publication-genre/"

	override suspend fun getChapters(manga: Manga, doc: Document): List<MangaChapter> {
		val slug = manga.url.removeSuffix('/').substringAfterLast('/')
		val doc2 = webClient.httpPost(
			"https://$domain/read-scan/$slug/ajax/chapters/",
			mapOf(),
		).parseHtml()
		val ul = doc2.body().selectFirstOrThrow("ul")
		val dateFormat = SimpleDateFormat(datePattern, Locale.US)
		return ul.select("li").mapChapters(reversed = true) { i, li ->
			val a = li.selectFirst("a")
			val href = a?.attrAsRelativeUrlOrNull("href") ?: li.parseFailed("Link is missing")
			MangaChapter(
				id = generateUid(href),
				name = a.ownText(),
				number = i + 1f,
				volume = 0,
				url = href,
				uploadDate = parseChapterDate(
					dateFormat,
					li.selectFirst("span.chapter-release-date i")?.text(),
				),
				source = source,
				scanlator = null,
				branch = null,
			)
		}
	}
}
