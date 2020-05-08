package com.lolkek.feature_dashboard_analytics

import com.lolkek.core_analytics.AnalyticsEvent
import com.lolkek.core_analytics_constants.AnalyticsConstants

object DashboardEvents {
    class DashboardRead(
        timeSpent: Long
    ) : AnalyticsEvent(
        AnalyticsConstants.Events.DashboardRead.EVENT,
        mapOf(
            AnalyticsConstants.Events.DashboardRead.Params.TIME_SPENT to timeSpent
        )
    )
}