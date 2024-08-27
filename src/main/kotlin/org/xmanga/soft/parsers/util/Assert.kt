package org.xmanga.soft.parsers.util

fun <T : Any> T?.assertNotNull(name: String): T? {
	assert(this != null) {
		"Value $name is null"
	}
	return this
}