package org.xmanga.soft.parsers.site.ru.grouple

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.config.ConfigKey
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource

@MangaSourceParser("SELFMANGA", "SelfManga", "ru", type = ContentType.OTHER)
internal class SelfMangaParser(
	context: MangaLoaderContext,
) : GroupleParser(context, MangaParserSource.SELFMANGA, 3) {

	override val configKeyDomain = ConfigKey.Domain(*domains)

	companion object {

		val domains = arrayOf(
			"selfmanga.live",
		)
	}
}
