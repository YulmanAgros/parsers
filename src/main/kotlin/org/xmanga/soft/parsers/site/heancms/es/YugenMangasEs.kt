package org.xmanga.soft.parsers.site.heancms.es

import org.xmanga.soft.parsers.Broken
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.*
import org.xmanga.soft.parsers.site.heancms.HeanCms

@Broken // Not dead but changed template
@MangaSourceParser("YUGEN_MANGAS_ES", "YugenMangas.lat", "es", ContentType.HENTAI)
internal class YugenMangasEs(context: MangaLoaderContext) :
	HeanCms(context, MangaParserSource.YUGEN_MANGAS_ES, "ikigaimangas.fraviral.com")
