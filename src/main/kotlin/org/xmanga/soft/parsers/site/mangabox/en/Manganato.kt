package org.xmanga.soft.parsers.site.mangabox.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.config.ConfigKey
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.mangabox.MangaboxParser

@MangaSourceParser("MANGANATO", "Manganato", "en")
internal class Manganato(context: MangaLoaderContext) :
	MangaboxParser(context, MangaParserSource.MANGANATO) {
	override val configKeyDomain = ConfigKey.Domain(
		"manganato.com",
		"chapmanganato.to",
		"chapmanganato.com",
	)
	override val otherDomain = "chapmanganato.to"

	override val selectPage = ".container-chapter-reader > img"
}
