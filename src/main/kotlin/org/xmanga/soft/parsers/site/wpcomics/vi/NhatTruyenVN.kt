package org.xmanga.soft.parsers.site.wpcomics.vi

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.config.ConfigKey
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.wpcomics.WpComicsParser

@MangaSourceParser("NHATTRUYENVN", "NhatTruyenVN", "vi")
internal class NhatTruyenVN(context: MangaLoaderContext) :
	WpComicsParser(context, MangaParserSource.NHATTRUYENVN, "nhattruyenvn.com", 36) {
	override val configKeyDomain: ConfigKey.Domain = ConfigKey.Domain(
		"nhattruyenvn.com", "www.nhattruyenss.net",
	)
}
