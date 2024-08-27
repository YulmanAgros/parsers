package org.xmanga.soft.parsers.site.ru.grouple

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.config.ConfigKey
import org.xmanga.soft.parsers.model.MangaParserSource

@MangaSourceParser("SEIMANGA", "SeiManga", "ru")
internal class SeiMangaParser(
	context: MangaLoaderContext,
) : GroupleParser(context, MangaParserSource.SEIMANGA, 21) {

	override val configKeyDomain = ConfigKey.Domain(*domains)

	companion object {

		val domains = arrayOf(
			"seimanga.me",
		)
	}
}
