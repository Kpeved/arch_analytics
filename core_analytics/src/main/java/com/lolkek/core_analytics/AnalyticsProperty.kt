package com.lolkek.core_analytics


abstract class AnalyticsProperty(
    val propertyName: String,
    val parameter: Any,
    val providers: List<AnalyticsProvider> = listOf(
        AnalyticsProvider.ANALYTICS_ALPHA,
        AnalyticsProvider.ANALYTICS_BETA
    )
)
