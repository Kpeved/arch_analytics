package com.lolkek.core_analytics.dummy

import org.json.JSONObject
import timber.log.Timber

/*
    This is a dummy class for analytics provider.
    Signatures are similar to Amplitude analytics
 */
class AnalyticsAmplitudeDummy {
    fun trackEvent(eventName: String, paramsJson: JSONObject){
        Timber.tag("ArchAnalytics").i("AnalyticsFirebase, event was sent. EventName: $eventName")
    }

    fun setUserProperties(property: JSONObject){
        Timber.tag("ArchAnalytics").i("AnalyticsFirebase, user properties were changed")
    }
}