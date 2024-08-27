package org.xmanga.soft.parsers.site.madara.en

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

// need to login and pay for read
@MangaSourceParser("KIARA18", "Kiara18", "en", ContentType.HENTAI)
internal class Kiara18(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.KIARA18, "18.kiara.cool")
