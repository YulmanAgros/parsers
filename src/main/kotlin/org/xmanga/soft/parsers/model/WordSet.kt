package org.xmanga.soft.parsers.model

import org.xmanga.soft.parsers.InternalParsersApi

@InternalParsersApi
class WordSet(private vararg val words: String) {

	fun anyWordIn(dateString: String): Boolean = words.any {
		dateString.contains(it, ignoreCase = true)
	}
}