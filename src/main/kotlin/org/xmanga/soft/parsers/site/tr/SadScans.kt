package org.xmanga.soft.parsers.site.tr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaParser
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.config.ConfigKey
import org.xmanga.soft.parsers.model.*
import org.xmanga.soft.parsers.util.*
import java.text.SimpleDateFormat
import java.util.*

@MangaSourceParser("SADSCANS", "SadScans", "tr")
internal class SadScans(context: MangaLoaderContext) : MangaParser(context, MangaParserSource.SADSCANS) {

	override val availableSortOrders: Set<SortOrder> = EnumSet.of(SortOrder.ALPHABETICAL)
	override val configKeyDomain = ConfigKey.Domain("sadscans.com")

	override fun onCreateConfig(keys: MutableCollection<ConfigKey<*>>) {
		super.onCreateConfig(keys)
		keys.add(userAgentKey)
	}

	override suspend fun getList(offset: Int, filter: MangaListFilter?): List<Manga> {
		if (offset > 0) {
			return emptyList()
		}

		val url = buildString {
			append("https://")
			append(domain)
			append("/series")
			when (filter) {
				is MangaListFilter.Search -> {
					append("?search=")
					append(filter.query.urlEncoded())
				}

				is MangaListFilter.Advanced -> {}
				null -> {}
			}
		}

		val doc = webClient.httpGet(url).parseHtml()
		return doc.select(".series-list").map { div ->
			val href = "/" + div.selectFirstOrThrow("a").attrAsRelativeUrl("href")
			Manga(
				id = generateUid(href),
				title = div.selectFirstOrThrow("h2").text(),
				altTitle = null,
				url = href,
				publicUrl = href.toAbsoluteUrl(domain),
				rating = RATING_UNKNOWN,
				isNsfw = false,
				coverUrl = div.selectFirstOrThrow("img").src()?.toAbsoluteUrl(domain).orEmpty(),
				tags = emptySet(),
				state = null,
				author = null,
				source = source,
			)
		}
	}

	override suspend fun getAvailableTags(): Set<MangaTag> = emptySet()

	override suspend fun getDetails(manga: Manga): Manga {
		val doc = webClient.httpGet(manga.url.toAbsoluteUrl(domain)).parseHtml()
		val dateFormat = SimpleDateFormat("dd MMM, yy", Locale.ENGLISH)
		return manga.copy(
			altTitle = null,
			state = when (doc.select(".status span").last()?.text()) {
				"Devam ediyor" -> MangaState.ONGOING
				"Tamamlandı" -> MangaState.FINISHED
				else -> null
			},
			tags = emptySet(),
			author = doc.select(".author span").last()?.text(),
			description = doc.selectFirstOrThrow(".summary").text(),
			chapters = doc.select(".chap-section .chap")
				.mapChapters(reversed = true) { i, div ->
					val a = div.selectFirstOrThrow("a")
					val url = "/" + a.attrAsRelativeUrl("href").toAbsoluteUrl(domain)
					MangaChapter(
						id = generateUid(url),
						name = a.text(),
						number = i + 1f,
						volume = 0,
						url = url,
						scanlator = null,
						uploadDate = dateFormat.tryParse(div.select(".detail span").last()?.text()),
						branch = null,
						source = source,
					)
				},
		)
	}

	override suspend fun getPages(chapter: MangaChapter): List<MangaPage> {
		val fullUrl = chapter.url.toAbsoluteUrl(domain)
		val doc = webClient.httpGet(fullUrl).parseHtml()
		return doc.select(".swiper-slide img").map { img ->
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
