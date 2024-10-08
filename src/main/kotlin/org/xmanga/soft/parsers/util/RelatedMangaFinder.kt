package org.xmanga.soft.parsers.util

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.coroutineScope
import org.xmanga.soft.parsers.MangaParser
import org.xmanga.soft.parsers.model.Manga

class RelatedMangaFinder(
	private val parsers: Collection<MangaParser>,
) {

	private val regexWhitespace = Regex("\\s+")

	suspend operator fun invoke(seed: Manga): List<Manga> = coroutineScope {
		parsers.singleOrNull()?.let { parser ->
			findRelatedImpl(this, parser, seed)
		} ?: parsers.map { parser ->
			async {
				findRelatedImpl(this, parser, seed)
			}
		}.awaitAll().flatten()
	}

	private suspend fun findRelatedImpl(scope: CoroutineScope, parser: MangaParser, seed: Manga): List<Manga> {
		val words = HashSet<String>()
		words += seed.title.split(regexWhitespace)
		seed.altTitle?.let {
			words += it.split(regexWhitespace)
		}
		if (words.isEmpty()) {
			return emptyList()
		}
		val results = words.map { keyword ->
			scope.async {
				val result = parser.getList(0, keyword)
				result.filter { it.id != seed.id && it.containKeyword(keyword) }
			}
		}.awaitAll()
		return results.minBy { if (it.isEmpty()) Int.MAX_VALUE else it.size }
	}

	private fun Manga.containKeyword(keyword: String): Boolean {
		return title.contains(keyword, ignoreCase = true) || altTitle?.contains(keyword, ignoreCase = true) == true
	}
}
