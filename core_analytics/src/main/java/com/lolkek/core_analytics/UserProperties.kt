package com.lolkek.core_analytics

import com.lolkek.core_analytics_constants.AnalyticsConstants

object UserProperties {
    class NotificationProperty(
        state: Boolean
    ) : AnalyticsProperty(AnalyticsConstants.UserProperties.NOTIFICATION_STATE, state)
}