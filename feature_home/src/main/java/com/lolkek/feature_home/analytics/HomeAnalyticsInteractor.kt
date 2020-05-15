package com.lolkek.feature_home.analytics

import com.lolkek.core_analytics.AnalyticsSender
import com.lolkek.core_analytics.AnalyticsUtils
import com.lolkek.feature_home_analytics.HomeEvents

class HomeAnalyticsInteractor(
    private val analyticsSender: AnalyticsSender
) {
    private var startTime: Long = 0

    fun startTracking() {
        startTime = System.currentTimeMillis()
    }

    fun sendEvent() {
        analyticsSender.sendEvent(HomeEvents.SendClicked(AnalyticsUtils.getTimeDurationInSecBetweenNow(startTime)))
        startTracking()
    }
}