package org.xmanga.soft.parsers.model

import org.xmanga.soft.parsers.MangaParser

class MangaTag(
	/**
	 * User-readable tag title, should be in Title case
	 */
	@JvmField val title: String,
	/**
	 * Identifier of a tag, must be unique among the source.
	 * @see MangaParser.getList
	 */
	@JvmField val key: String,
	@JvmField val source: MangaSource,
) {

	override fun equals(other: Any?): Boolean {
		if (this === other) return true
		if (javaClass != other?.javaClass) return false

		other as MangaTag

		if (title != other.title) return false
		if (key != other.key) return false
		if (source != other.source) return false

		return true
	}

	override fun hashCode(): Int {
		var result = title.hashCode()
		result = 31 * result + key.hashCode()
		result = 31 * result + source.hashCode()
		return result
	}

	override fun toString(): String {
		return "MangaTag($key \"$title\" - $source)"
	}
}
