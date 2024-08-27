package org.xmanga.soft.parsers

import org.xmanga.soft.parsers.config.ConfigKey
import org.xmanga.soft.parsers.config.MangaSourceConfig

internal class SourceConfigMock : MangaSourceConfig {

	override fun <T> get(key: ConfigKey<T>): T = key.defaultValue
}