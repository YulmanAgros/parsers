package org.xmanga.soft.parsers.site.galleryadults.all

import org.jsoup.nodes.Element
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.model.MangaTag
import org.xmanga.soft.parsers.site.galleryadults.GalleryAdultsParser
import org.xmanga.soft.parsers.util.mapToSet
import org.xmanga.soft.parsers.util.removeSuffix
import java.util.*

@MangaSourceParser("HENTAIROX", "HentaiRox", type = ContentType.HENTAI)
internal class HentaiRox(context: MangaLoaderContext) :
	GalleryAdultsParser(context, MangaParserSource.HENTAIROX, "hentairox.com") {
	override val selectGalleryImg = ".inner_thumb img"
	override val selectTags = ".gtags"
	override val selectTag = "li:contains(Tags:)"
	override val selectAuthor = "li:contains(Artists:) span.item_name"
	override val selectLanguageChapter = "li:contains(Languages:) .item_name"

	override suspend fun getAvailableLocales(): Set<Locale> = setOf(
		Locale.ENGLISH,
		Locale.FRENCH,
		Locale.JAPANESE,
		Locale("es"),
		Locale("ru"),
		Locale("ko"),
		Locale.GERMAN,
	)

	override fun Element.parseTags() = select("a.tag, .gallery_title a").mapToSet {
		val key = it.attr("href").removeSuffix('/').substringAfterLast('/')
		val name = it.selectFirst(".item_name")?.text() ?: it.text()
		MangaTag(
			key = key,
			title = name,
			source = source,
		)
	}
}
