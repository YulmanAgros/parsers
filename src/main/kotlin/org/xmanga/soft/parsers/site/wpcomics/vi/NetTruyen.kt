package org.xmanga.soft.parsers.site.wpcomics.vi

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.config.ConfigKey
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.wpcomics.WpComicsParser

@MangaSourceParser("NETTRUYEN", "NetTruyen", "vi")
internal class NetTruyen(context: MangaLoaderContext) :
	WpComicsParser(context, MangaParserSource.NETTRUYEN, "www.nettruyenupp.com", 44) {
	override val configKeyDomain: ConfigKey.Domain = ConfigKey.Domain(
		"www.nettruyenupp.com", "nettruyenaa.com", "nettruyenx.com",
	)
}
