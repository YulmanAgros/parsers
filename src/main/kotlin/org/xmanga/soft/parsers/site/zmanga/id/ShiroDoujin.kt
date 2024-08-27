package org.xmanga.soft.parsers.site.zmanga.id

import org.jsoup.nodes.Document
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaChapter
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.zmanga.ZMangaParser
import org.xmanga.soft.parsers.util.attrAsRelativeUrl
import org.xmanga.soft.parsers.util.generateUid
import org.xmanga.soft.parsers.util.mapChapters
import org.xmanga.soft.parsers.util.selectFirstOrThrow
import java.text.SimpleDateFormat

@MangaSourceParser("SHIRO_DOUJIN", "ShiroDoujin", "id", ContentType.HENTAI)
internal class ShiroDoujin(context: MangaLoaderContext) :
	ZMangaParser(context, MangaParserSource.SHIRO_DOUJIN, "shirodoujin.com") {

	override suspend fun getChapters(doc: Document): List<MangaChapter> {
		val dateFormat = SimpleDateFormat(datePattern, sourceLocale)
		return doc.body().select(selectChapter).mapChapters(reversed = true) { i, li ->
			val a = li.selectFirstOrThrow("a")
			val href = a.attrAsRelativeUrl("href")
			val dateText = li.selectFirst(selectDate)?.text()
			val numChapter = li.selectFirstOrThrow(".flexch-infoz span").html().substringAfterLast("Chapter ")
				.substringBefore("<span")
			MangaChapter(
				id = generateUid(href),
				name = "Chapter $numChapter",
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
}
