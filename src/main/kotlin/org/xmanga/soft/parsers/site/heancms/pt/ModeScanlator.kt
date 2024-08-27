package org.xmanga.soft.parsers.site.heancms.pt

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.*
import org.xmanga.soft.parsers.site.heancms.HeanCms

@MangaSourceParser("MODESCANLATOR", "ModeScanlator", "pt")
internal class ModeScanlator(context: MangaLoaderContext) :
	HeanCms(context, MangaParserSource.MODESCANLATOR, "site.modescanlator.net") {
	override val apiPath = "api.modescanlator.net"
}

