package com.lolkek.feature_notifications.analytics

import com.lolkek.core_analytics.AnalyticsSender
import com.lolkek.core_analytics.UserProperties
import com.lolkek.feature_notifications_analytics.NotificationEvents

class NotificationsAnalyticsInteractor(
    private val analyticsSender: AnalyticsSender
) {
    fun sendNotificationChanged(newState: Boolean) {
        analyticsSender.setUserProperty(UserProperties.NotificationProperty(newState))
        analyticsSender.sendEvent(NotificationEvents.NotificationChanged)
    }
}