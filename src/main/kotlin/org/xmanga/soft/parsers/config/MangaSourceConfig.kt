package org.xmanga.soft.parsers.config

interface MangaSourceConfig {

	operator fun <T> get(key: ConfigKey<T>): T
}