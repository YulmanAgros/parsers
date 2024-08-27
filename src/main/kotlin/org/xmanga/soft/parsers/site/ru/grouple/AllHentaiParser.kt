package org.xmanga.soft.parsers.site.ru.grouple

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.config.ConfigKey
import org.xmanga.soft.parsers.exception.AuthRequiredException
import org.xmanga.soft.parsers.exception.ParseException
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaChapter
import org.xmanga.soft.parsers.model.MangaPage
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.util.domain
import org.xmanga.soft.parsers.util.parseFailed
import org.xmanga.soft.parsers.util.parseHtml
import org.xmanga.soft.parsers.util.urlEncoded

@MangaSourceParser("ALLHENTAI", "AllHentai", "ru", type = ContentType.HENTAI)
internal class AllHentaiParser(
	context: MangaLoaderContext,
) : GroupleParser(context, MangaParserSource.ALLHENTAI, 1) {

	override val configKeyDomain = ConfigKey.Domain(
		"z.ahen.me",
		"20.allhen.online",
		"24.allhen.online",
		"z.allhen.online",
		"2023.allhen.online",
	)
	override val defaultIsNsfw = true

	override val authUrl: String
		get() {
			val targetUri = "https://$domain/".urlEncoded()
			return "https://qawa.org/internal/auth/login?targetUri=$targetUri&siteId=1"
		}

	override suspend fun getPages(chapter: MangaChapter): List<MangaPage> {
		try {
			return super.getPages(chapter)
		} catch (e: ParseException) {
			if (isAuthorized) {
				throw e
			} else {
				throw AuthRequiredException(source, e)
			}
		}
	}

	override suspend fun getUsername(): String {
		val root = webClient.httpGet("https://qawa.org/").parseHtml().body()
		val element = root.selectFirst("img.user-avatar") ?: throw AuthRequiredException(source)
		val res = element.parent()?.text()
		return if (res.isNullOrEmpty()) {
			root.parseFailed("Cannot find username")
		} else {
			res
		}
	}
}
