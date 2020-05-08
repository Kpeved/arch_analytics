package com.lolkek.feature_dashboard

import com.lolkek.core_analytics.AnalyticsSender
import com.lolkek.core_analytics.AnalyticsUtils
import com.lolkek.feature_dashboard_analytics.DashboardEvents

class DashboardAnalyticsInteractor(
    private val analyticsSender: AnalyticsSender
) {

    private var startTime: Long = 0
    private var sendEvent = true

    fun startTracking() {
        startTime = System.currentTimeMillis()
    }

    fun sendDashboardRead() {
        if(sendEvent) {
            analyticsSender.sendEvent(
                DashboardEvents.DashboardRead(
                    AnalyticsUtils.getTimeDurationInSecBetweenNow(startTime)
                )
            )
        } else {
            sendEvent = true
        }
    }

    fun setDontSendEvent() {
        sendEvent = false
    }
}