package org.xmanga.soft.parsers.exception

import org.xmanga.soft.parsers.InternalParsersApi
import org.xmanga.soft.parsers.model.MangaSource

/**
 * Authorization is required for access to the requested content
 */
class AuthRequiredException @InternalParsersApi @JvmOverloads constructor(
	val source: MangaSource,
	cause: Throwable? = null,
) : RuntimeException("Authorization required", cause)
