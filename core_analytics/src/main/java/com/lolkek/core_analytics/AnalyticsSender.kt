package com.lolkek.core_analytics

import com.lolkek.core.toBundle
import com.lolkek.core.toJson
import com.lolkek.core_analytics.dummy.AnalyticsAmplitudeDummy
import com.lolkek.core_analytics.dummy.AnalyticsFirebaseDummy
import org.json.JSONObject
import timber.log.Timber

class AnalyticsSender(
    private val analyticsFirebase: AnalyticsFirebaseDummy, //in real life instead of dummy analytics
    private val analyticsAmplitude: AnalyticsAmplitudeDummy
) {

    fun sendEvent(event: AnalyticsEvent) {
        if (event.providers.contains(AnalyticsProvider.ANALYTICS_FIREBASE)) {
            analyticsFirebase.logEvent(event.eventName, event.params.toBundle())
        }
        if (event.providers.contains(AnalyticsProvider.ANALYTICS_AMPLITUDE)) {
            analyticsAmplitude.trackEvent(event.eventName, event.params.toJson())
        }
        Timber.tag("ArchAnalytics")
            .d("Event was sent: ${event.eventName}. Params: ${event.params}. Providers: ${event.providers}")
    }

    fun setUserProperty(property: AnalyticsProperty) {
        if (property.providers.contains(AnalyticsProvider.ANALYTICS_FIREBASE)) {
            analyticsFirebase.setUserProperty(property.propertyName, property.toString())
        }
        if (property.providers.contains(AnalyticsProvider.ANALYTICS_AMPLITUDE)) {
            analyticsAmplitude.setUserProperties(JSONObject().apply {
                put(
                    property.propertyName,
                    property
                )
            })
        }
    }
}