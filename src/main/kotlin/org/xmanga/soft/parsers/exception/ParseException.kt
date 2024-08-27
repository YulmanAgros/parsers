package org.xmanga.soft.parsers.exception

import org.xmanga.soft.parsers.InternalParsersApi

class ParseException @InternalParsersApi @JvmOverloads constructor(
	val shortMessage: String?,
	val url: String,
	cause: Throwable? = null,
) : RuntimeException("$shortMessage at $url", cause)