package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("COMIZ", "Comiz", "en", ContentType.HENTAI)
internal class Comiz(context: MangaLoaderContext) : MadaraParser(context, MangaParserSource.COMIZ, "v2.comiz.net", 10)
