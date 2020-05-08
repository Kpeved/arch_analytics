package com.lolkek.core_analytics


abstract class AnalyticsEvent(
    val eventName: String,
    val params: Map<String, Any?> = emptyMap(),
    val providers: List<AnalyticsProvider> = listOf(
        AnalyticsProvider.ANALYTICS_ALPHA,
        AnalyticsProvider.ANALYTICS_BETA
    )
)
