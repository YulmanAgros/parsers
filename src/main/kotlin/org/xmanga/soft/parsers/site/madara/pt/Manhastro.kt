package org.xmanga.soft.parsers.site.madara.pt

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.MangaChapter
import org.xmanga.soft.parsers.model.MangaPage
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.site.madara.MadaraParser
import org.xmanga.soft.parsers.util.domain
import org.xmanga.soft.parsers.util.generateUid
import org.xmanga.soft.parsers.util.parseHtml
import org.xmanga.soft.parsers.util.selectFirstOrThrow
import org.xmanga.soft.parsers.util.toAbsoluteUrl

@MangaSourceParser("MANHASTRO", "Manhastro", "pt")
internal class Manhastro(context: MangaLoaderContext) :
	MadaraParser(context, MangaParserSource.MANHASTRO, "manhastro.com", 24) {

	override val listUrl = "lermanga/"
	override val tagPrefix = "genre/"

	override suspend fun getPages(chapter: MangaChapter): List<MangaPage> {
		val fullUrl = chapter.url.toAbsoluteUrl(domain)
		val doc = webClient.httpGet(fullUrl).parseHtml()

		val script = doc.selectFirstOrThrow("script:containsData(imageLinks)").data()
		val images = script.substringAfter('[').substringBeforeLast(']')
			.replace("\"", "").split(',')
		return images.map { img ->
			val url = context.decodeBase64(img).toString(Charsets.UTF_8)
			MangaPage(
				id = generateUid(url),
				url = url,
				preview = null,
				source = source,
			)
		}
	}
}
