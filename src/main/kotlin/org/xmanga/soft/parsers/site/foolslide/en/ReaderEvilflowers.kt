package org.xmanga.soft.parsers.site.foolslide.en

import org.xmanga.soft.parsers.Broken
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.foolslide.FoolSlideParser

@Broken
@MangaSourceParser("READER_EVILFLOWERS", "Evil Flowers", "en")
internal class ReaderEvilflowers(context: MangaLoaderContext) :
	FoolSlideParser(context, MangaParserSource.READER_EVILFLOWERS, "reader.evilflowers.com")
