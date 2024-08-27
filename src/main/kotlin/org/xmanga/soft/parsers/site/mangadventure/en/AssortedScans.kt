package org.xmanga.soft.parsers.site.mangadventure.en

import androidx.collection.ArraySet
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.model.MangaTag
import org.xmanga.soft.parsers.site.mangadventure.MangAdventureParser

@MangaSourceParser("ASSORTEDSCANS", "AssortedScans", "en")
internal class AssortedScans(context: MangaLoaderContext) :
	MangAdventureParser(context, MangaParserSource.ASSORTEDSCANS, "assortedscans.com") {
	// tags that don't have any series and make the tests fail
	private val emptyTags = setOf(
		"Doujinshi", "Harem", "Hentai", "Mecha",
		"Shoujo Ai", "Shounen Ai", "Smut", "Yaoi",
	)

	override suspend fun getAvailableTags(): Set<MangaTag> {
		val tags = super.getAvailableTags()
		return tags.filterNotTo(ArraySet(tags.size)) { it.key in emptyTags }
	}
}
