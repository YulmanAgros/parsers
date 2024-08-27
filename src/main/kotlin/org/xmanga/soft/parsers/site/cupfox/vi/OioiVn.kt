package org.xmanga.soft.parsers.site.cupfox.vi

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.cupfox.CupFoxParser

@MangaSourceParser("OIOIVN", "OioiVn", "vi")
internal class OioiVn(context: MangaLoaderContext) :
	CupFoxParser(context, MangaParserSource.OIOIVN, "oioivn.com")
