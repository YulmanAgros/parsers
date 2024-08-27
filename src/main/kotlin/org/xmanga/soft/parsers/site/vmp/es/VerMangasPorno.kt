package org.xmanga.soft.parsers.site.vmp.es

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.vmp.VmpParser

@MangaSourceParser("VERMANGASPORNO", "VerMangasPorno", "es", ContentType.HENTAI)
internal class VerMangasPorno(context: MangaLoaderContext) :
	VmpParser(context, MangaParserSource.VERMANGASPORNO, "vermangasporno.com")
