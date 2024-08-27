package org.xmanga.soft.parsers.site.madara.pt

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser

@MangaSourceParser("WICKEDWITCHSCAN", "WickedWitchScan", "pt")
internal class WickedWitchScan(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.WICKEDWITCHSCAN, "wicked-witch-scan.com", pageSize = 10) {
	override val postReq = true
}
