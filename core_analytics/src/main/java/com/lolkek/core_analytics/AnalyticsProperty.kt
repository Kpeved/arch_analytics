package com.lolkek.core_analytics


abstract class AnalyticsProperty(
    val eventName: String,
    val params: Map<String, Any?> = emptyMap(),
    val providers: List<AnalyticsProvider> = listOf(
        AnalyticsProvider.ANALYTICS_ALPHA,
        AnalyticsProvider.ANALYTICS_BETA
    )
)
