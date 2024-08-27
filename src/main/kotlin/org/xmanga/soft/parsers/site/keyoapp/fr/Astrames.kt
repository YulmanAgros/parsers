package org.xmanga.soft.parsers.site.keyoapp.fr

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.keyoapp.KeyoappParser

@MangaSourceParser("ASTRAMES", "Astrames", "fr")
internal class Astrames(context: MangaLoaderContext) :
	KeyoappParser(context, MangaParserSource.ASTRAMES, "astrames.fr")
