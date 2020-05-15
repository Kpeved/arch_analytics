package com.lolkek.feature_home_analytics

import com.lolkek.core_analytics.AnalyticsEvent
import com.lolkek.core_analytics_constants.AnalyticsConstants

object HomeEvents {

    class SendClicked(
        timeBetweenClicks: Long
    ) : AnalyticsEvent(
        AnalyticsConstants.Events.SendClicked.EVENT,
        mapOf( // create a map of properties where key is taken from constants, and value from
            AnalyticsConstants.Events.SendClicked.Params.TIME_BETWEEN_CLICKS to timeBetweenClicks
        )
    )
}