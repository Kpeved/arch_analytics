package com.lolkek.core_analytics.dummy

import android.os.Bundle
import timber.log.Timber
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

/*
    This is a dummy class for analytics provider.
    Signatures are similar to Firebase analytics
 */
class AnalyticsAlphaDummy() {
    fun logEvent(eventName: String, bundle: Bundle){
        Timber.tag("ArchAnalytics").i("AnalyticsAlpha, event was sent. EventName: $eventName")
    }

    fun setUserProperty(propertyName: String, propertyValue: String){
        Timber.tag("ArchAnalytics").i("AnalyticsAlpha, user property $propertyName was changed")
    }
}