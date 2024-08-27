package org.xmanga.soft.parsers

import org.junit.jupiter.params.provider.EnumSource
import org.junit.jupiter.params.provider.EnumSource.Mode.EXCLUDE
import org.xmanga.soft.parsers.model.MangaParserSource

@EnumSource(MangaParserSource::class, names = ["DUMMY"], mode = EXCLUDE)
internal annotation class MangaSources
