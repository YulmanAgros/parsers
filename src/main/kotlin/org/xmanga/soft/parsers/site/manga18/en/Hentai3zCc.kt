package org.xmanga.soft.parsers.site.manga18.en

import org.jsoup.nodes.Document
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.Manga
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.model.RATING_UNKNOWN
import org.xmanga.soft.parsers.site.manga18.Manga18Parser
import org.xmanga.soft.parsers.util.*

@MangaSourceParser("HENTAI3ZCC", "Hentai3z.cc", "en", ContentType.HENTAI)
internal class Hentai3zCc(context: MangaLoaderContext) :
	Manga18Parser(context, MangaParserSource.HENTAI3ZCC, "hentai3z.cc") {

	override fun parseMangaList(doc: Document): List<Manga> {
		return doc.select("div.story_item").map { div ->
			val href = div.selectFirstOrThrow("a").attrAsRelativeUrl("href")
			Manga(
				id = generateUid(href),
				url = href,
				publicUrl = href.toAbsoluteUrl(div.host ?: domain),
				coverUrl = div.selectFirst("img")?.src()
					?.replace("cover_thumb_2.webp", "cover_250x350.jpg")
					?.replace("admin.manga18.us", "bk.18porncomic.com")
					.orEmpty(),
				title = div.selectFirstOrThrow("div.mg_info").selectFirst("div.mg_name a")?.text().orEmpty(),
				altTitle = null,
				rating = RATING_UNKNOWN,
				tags = emptySet(),
				author = null,
				state = null,
				source = source,
				isNsfw = isNsfwSource,
			)
		}
	}
}
