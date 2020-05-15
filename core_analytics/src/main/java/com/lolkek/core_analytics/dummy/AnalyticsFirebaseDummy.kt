package com.lolkek.core_analytics.dummy

import android.os.Bundle
import timber.log.Timber

/*
    This is a dummy class for analytics provider.
    Signatures are similar to Firebase analytics
 */
class AnalyticsFirebaseDummy() {
    fun logEvent(eventName: String, bundle: Bundle){
        Timber.tag("ArchAnalytics").i("AnalyticsFirebase, event was sent. EventName: $eventName")
    }

    fun setUserProperty(propertyName: String, propertyValue: String){
        Timber.tag("ArchAnalytics").i("AnalyticsFirebase, user property $propertyName was changed")
    }
}