package org.xmanga.soft.parsers.site.heancmsalt.es

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.Manga
import org.xmanga.soft.parsers.model.MangaChapter
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.heancmsalt.HeanCmsAlt
import org.xmanga.soft.parsers.util.*
import java.text.SimpleDateFormat

@MangaSourceParser("BRAKEOUT", "Brakeout", "es")
internal class Brakeout(context: MangaLoaderContext) :
	HeanCmsAlt(context, MangaParserSource.BRAKEOUT, "brakeout.xyz", 10) {
	override val selectManga = "div.grid.grid-cols-2 figure"
	override val selectMangaTitle = "figcaption"

	override val selectDesc = "#section-sinopsis p"
	override val selectChapter = ".grid-capitulos div.contenedor-capitulo-miniatura"
	override val selectChapterTitle = "#name"
	override val selectChapterDate = "time"
	override val datePattern = "yyyy-MM-dd'T'HH:mm:ss.SSSSSS'Z'"
	override suspend fun getDetails(manga: Manga): Manga {
		val fullUrl = manga.url.toAbsoluteUrl(domain)
		val doc = webClient.httpGet(fullUrl).parseHtml()
		val dateFormat = SimpleDateFormat(datePattern, sourceLocale)
		return manga.copy(
			altTitle = doc.selectFirst(selectAlt)?.text().orEmpty(),
			description = doc.selectFirstOrThrow(selectDesc).html(),
			chapters = doc.select(selectChapter)
				.mapChapters(reversed = true) { i, div ->
					val a = div.selectFirstOrThrow("a")
					val dateText = div.selectFirstOrThrow(selectChapterDate).text()
					val url = a.attrAsRelativeUrl("href").toAbsoluteUrl(domain)
					MangaChapter(
						id = generateUid(url),
						name = div.selectFirstOrThrow(selectChapterTitle).text(),
						number = i + 1f,
						volume = 0,
						url = url,
						scanlator = null,
						uploadDate = parseChapterDate(
							dateFormat,
							dateText,
						),
						branch = null,
						source = source,
					)
				},
		)
	}

	override val selectPage = "section img.readImg"
}
