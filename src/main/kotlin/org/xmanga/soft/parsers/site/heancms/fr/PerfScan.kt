package org.xmanga.soft.parsers.site.heancms.fr


import org.xmanga.soft.parsers.MangaLoaderContext
import org.xmanga.soft.parsers.MangaSourceParser
import org.xmanga.soft.parsers.model.*
import org.xmanga.soft.parsers.site.heancms.HeanCms

@MangaSourceParser("PERF_SCAN", "PerfScan", "fr")
internal class PerfScan(context: MangaLoaderContext) :
	HeanCms(context, MangaParserSource.PERF_SCAN, "perf-scan.fr")
