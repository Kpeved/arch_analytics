package com.lolkek.core_analytics

import com.lolkek.core.toBundle
import com.lolkek.core.toJson
import com.lolkek.core_analytics.dummy.AnalyticsAlphaDummy
import com.lolkek.core_analytics.dummy.AnalyticsBetaDummy
import org.json.JSONObject
import timber.log.Timber

class AnalyticsSender(
    private val analyticsAlpha: AnalyticsAlphaDummy,
    private val analyticsBeta: AnalyticsBetaDummy
) {

    fun sendEvent(event: AnalyticsEvent) {
        if (event.providers.contains(AnalyticsProvider.ANALYTICS_ALPHA)) {
            analyticsAlpha.logEvent(event.eventName, event.params.toBundle())
        }
        if (event.providers.contains(AnalyticsProvider.ANALYTICS_BETA)) {
            analyticsBeta.trackEvent(event.eventName, event.params.toJson())
        }
        Timber.tag("ArchAnalytics")
            .d("Event was sent: ${event.eventName}. Params: ${event.params}. Providers: ${event.providers}")
    }

    fun setUserProperty(property: AnalyticsProperty) {
        analyticsAlpha.setUserProperty(property.propertyName, property.toString())
        analyticsBeta.setUserProperties(JSONObject().apply { put(property.propertyName, property) })
    }
}