package org.xmanga.soft.parsers.site.onemanga.fr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.onemanga.OneMangaParser

@MangaSourceParser("FIREFORCE", "FireForce", "fr")
internal class FireForce(context: MangaLoaderContext) :
	OneMangaParser(context, MangaParserSource.FIREFORCE, "fireforce.fr")
