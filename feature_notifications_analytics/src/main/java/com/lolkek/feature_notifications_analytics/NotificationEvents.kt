package com.lolkek.feature_notifications_analytics

import com.lolkek.core_analytics_constants.AnalyticsConstants
import com.lolkek.core_analytics.AnalyticsEvent

object NotificationEvents {
    object NotificationChanged: AnalyticsEvent(AnalyticsConstants.Events.NotificationsChanged.EVENT)
}