package org.xmanga.soft.parsers.site.madara.pt

import org.xmanga.soft.parsers.Broken
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@Broken
@MangaSourceParser("PSUNICORN", "PsUnicorn", "pt", ContentType.HENTAI)
internal class Psunicorn(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.PSUNICORN, "psunicorn.com")
