package org.xmanga.soft.parsers.site.fuzzydoodle.ar

import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.ContentType
import org.xmanga.soft.parsers.model.MangaParserSource
import org.xmanga.soft.parsers.model.MangaState
import org.xmanga.soft.parsers.site.fuzzydoodle.FuzzyDoodleParser
import java.util.EnumSet

@MangaSourceParser("HENTAISLAYER", "HentaiSlayer", "ar", ContentType.HENTAI)
internal class HentaiSlayer(context: MangaLoaderContext) :
	FuzzyDoodleParser(context, MangaParserSource.HENTAISLAYER, "hentaislayer.net") {
	override val availableStates: Set<MangaState> =
		EnumSet.of(MangaState.ONGOING, MangaState.FINISHED, MangaState.ABANDONED)
	override val ongoingValue = "مستمر"
	override val finishedValue = "مكتمل"
	override val abandonedValue = "متوقف"
}
