package org.xmanga.soft.parsers.site.madara.ar

import org.jsoup.nodes.Document
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaChapter
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser
import org.xmanga.soft.parsers.util.attrAsRelativeUrlOrNull
import org.xmanga.soft.parsers.util.generateUid
import org.xmanga.soft.parsers.util.mapChapters
import org.xmanga.soft.parsers.util.parseFailed
import java.text.SimpleDateFormat

@MangaSourceParser("ROCKSMANGA", "RocksManga", "ar")
internal class RocksManga(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.ROCKSMANGA, "rocksmanga.com") {
	override val selectChapter = "ul#chapter-list li.chapter-item"
	override val datePattern = "d MMMM yyyy"
	override val selectDate = ".ch-post-time"
	override val selectBodyPage = "div.reading-content"
	override val selectPage = "img"
	override val selectDesc = ".story"

	override suspend fun loadChapters(mangaUrl: String, document: Document): List<MangaChapter> {
		val dateFormat = SimpleDateFormat(datePattern, sourceLocale)
		return document.select(selectChapter).mapChapters(reversed = true) { i, li ->
			val a = li.selectFirst("a")
			val href = a?.attrAsRelativeUrlOrNull("href") ?: li.parseFailed("Link is missing")
			val link = href + stylePage
			val dateText = li.selectFirst("a.c-new-tag")?.attr("title") ?: li.selectFirst(selectDate)?.text()
			val name = a.selectFirst(".ch-title")?.text() ?: a.ownText()
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
