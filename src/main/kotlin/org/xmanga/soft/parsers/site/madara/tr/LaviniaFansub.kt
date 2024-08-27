package org.xmanga.soft.parsers.site.madara.tr

import org.jsoup.nodes.Document
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaChapter
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser
import org.xmanga.soft.parsers.util.attrAsRelativeUrlOrNull
import org.xmanga.soft.parsers.util.domain
import org.xmanga.soft.parsers.util.generateUid
import org.xmanga.soft.parsers.util.mapChapters
import org.xmanga.soft.parsers.util.parseFailed
import org.xmanga.soft.parsers.util.parseHtml
import org.xmanga.soft.parsers.util.removeSuffix
import org.xmanga.soft.parsers.util.toAbsoluteUrl
import java.text.SimpleDateFormat

@MangaSourceParser("LAVINIAFANSUB", "LaviniaFansub", "tr", ContentType.HENTAI)
internal class LaviniaFansub(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.LAVINIAFANSUB, "laviniafansub.com", 18) {
	override val datePattern = "dd/MM/yyyy"

	override suspend fun loadChapters(mangaUrl: String, document: Document): List<MangaChapter> {
		val doc = if (postReq) {
			val mangaId = document.select("div#manga-chapters-holder").attr("data-id")
			val url = "https://$domain/wp-admin/admin-ajax.php"
			val postData = "action=manga_get_chapters&manga=$mangaId"
			webClient.httpPost(url, postData).parseHtml()
		} else {
			val url = mangaUrl.toAbsoluteUrl(domain).removeSuffix('/') + "/ajax/chapters/"
			webClient.httpPost(url, emptyMap()).parseHtml()
		}
		val dateFormat = SimpleDateFormat(datePattern, sourceLocale)
		return doc.select(selectChapter).mapChapters(reversed = true) { i, li ->
			val a = li.selectFirst("a:not(:has(img))")
			val href = a?.attrAsRelativeUrlOrNull("href") ?: li.parseFailed("Link is missing")
			val link = href + stylePage
			val dateText = li.selectFirst("a.c-new-tag")?.attr("title") ?: li.selectFirst(selectDate)?.text()
			val name = a.selectFirst("p")?.text() ?: a.ownText()
			MangaChapter(
				id = generateUid(href),
				url = link,
				name = name,
				number = i + 1f,
				volume = 0,
				branch = null,
				uploadDate = parseChapterDate(
					dateFormat,
					dateText,
				),
				scanlator = null,
				source = source,
			)
		}
	}
}
