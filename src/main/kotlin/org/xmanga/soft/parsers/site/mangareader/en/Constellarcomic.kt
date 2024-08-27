package org.xmanga.soft.parsers.site.mangareader.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.Manga
import org.xmanga.soft.parsers.model.MangaChapter
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser
import org.xmanga.soft.parsers.util.*

@MangaSourceParser("CONSTELLARCOMIC", "ConstellarComic", "en", ContentType.HENTAI)
internal class Constellarcomic(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.CONSTELLARCOMIC,
		"constellarcomic.com",
		pageSize = 30,
		searchPageSize = 18,
	) {
	override val selectTestScript = "script:containsData(ts_rea_der_._run)"
	override val isTagsExclusionSupported = false

	override suspend fun getDetails(manga: Manga): Manga {
		val docs = webClient.httpGet(manga.url.toAbsoluteUrl(domain)).parseHtml()
		val chapters = docs.select(selectChapter).mapChapters(reversed = true) { index, element ->
			val url = element.selectFirst("a")?.attrAsRelativeUrl("href") ?: return@mapChapters null
			MangaChapter(
				id = generateUid(url),
				name = element.selectFirst(".chapternum")?.textOrNull() ?: "Chapter ${index + 1}",
				url = url,
				number = index + 1f,
				volume = 0,
				scanlator = null,
				uploadDate = 0,
				branch = null,
				source = source,
			)
		}
		return parseInfo(docs, manga, chapters)
	}
}
