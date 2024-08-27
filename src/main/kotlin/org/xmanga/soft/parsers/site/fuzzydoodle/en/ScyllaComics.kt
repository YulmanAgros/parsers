package org.xmanga.soft.parsers.site.fuzzydoodle.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.fuzzydoodle.FuzzyDoodleParser

@MangaSourceParser("SCYLLACOMICS", "ScyllaComics", "en")
internal class ScyllaComics(context: MangaLoaderContext) :
	FuzzyDoodleParser(context, MangaParserSource.SCYLLACOMICS, "scyllacomics.xyz")
