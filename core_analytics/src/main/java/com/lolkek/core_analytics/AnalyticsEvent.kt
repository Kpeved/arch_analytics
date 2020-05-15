package com.lolkek.core_analytics


abstract class AnalyticsEvent(
    val eventName: String,  // Name of the event
    val params: Map<String, Any?> = emptyMap(), // Key values pair of params, where key- is a name of event
    val providers: List<AnalyticsProvider> = listOf( // the list of supported providers for this event. By default, we can send this event to all analytics providers
        AnalyticsProvider.ANALYTICS_FIREBASE, // A couple of dummy providers.
        AnalyticsProvider.ANALYTICS_AMPLITUDE
    )
)
