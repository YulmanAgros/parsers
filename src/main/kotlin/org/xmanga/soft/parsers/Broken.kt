package org.xmanga.soft.parsers

/**
 * Annotate [MangaParser] implementation to mark this parser as broken instead of removing it
 */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.SOURCE)
annotation class Broken
