package org.xmanga.soft.parsers.site.heancms.en

import org.xmanga.soft.parsers.Broken
import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.heancms.HeanCms
import org.xmanga.soft.parsers.util.domain

@Broken // Not dead, changed template
@MangaSourceParser("TEMPLESCAN", "TempleScan", "en")
internal class TempleScan(context: MangaLoaderContext) :
	HeanCms(context, MangaParserSource.TEMPLESCAN, "templescan.net") {
	override val pathManga = "comic"

	override val apiPath: String
		get() = "$domain/apiv1"
}
