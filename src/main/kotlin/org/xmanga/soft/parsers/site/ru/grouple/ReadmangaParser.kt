package org.xmanga.soft.parsers.site.ru.grouple

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.config.ConfigKey
import org.xmanga.soft.parsers.model.MangaParserSource

@MangaSourceParser("READMANGA_RU", "ReadManga", "ru")
internal class ReadmangaParser(
	context: MangaLoaderContext,
) : GroupleParser(context, MangaParserSource.READMANGA_RU, 1) {

	override val configKeyDomain = ConfigKey.Domain(*domains)

	companion object {

		val domains = arrayOf(
			"readmanga.live",
			"readmanga.io",
			"readmanga.me",
		)
	}
}
