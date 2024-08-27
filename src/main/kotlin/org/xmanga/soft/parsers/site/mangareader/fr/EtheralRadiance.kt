package org.xmanga.soft.parsers.site.mangareader.fr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangareader.MangaReaderParser
import org.xmanga.soft.parsers.util.domain
import org.xmanga.soft.parsers.util.insertCookies

@MangaSourceParser("ETHERALRADIANCE", "EtheralRadiance", "fr")
internal class EtheralRadiance(context: MangaLoaderContext) :
	MangaReaderParser(
		context,
		MangaParserSource.ETHERALRADIANCE,
		"www.etheralradiance.eu",
		pageSize = 20,
		searchPageSize = 10,
	) {
	override val isTagsExclusionSupported = false

	init {
		context.cookieJar.insertCookies(
			domain,
			"_lscache_vary=1;",
		)
	}
}
