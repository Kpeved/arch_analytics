package com.lolkek.archanalytics.analytics

import com.lolkek.core_analytics_constants.AnalyticsConstants
import com.lolkek.core_analytics.AnalyticsEvent
import com.lolkek.core_analytics.AnalyticsProvider

object AppEvents {
    object FirstLaunch : AnalyticsEvent(AnalyticsConstants.Events.FirstLaunch.EVENT)
    object SessionStart : AnalyticsEvent(AnalyticsConstants.Events.SessionStart.EVENT)

    class Navigated(
        from: NavigationSource,
        to: NavigationSource
    ) : AnalyticsEvent(
        AnalyticsConstants.Events.Navigated.EVENT,
        mapOf(
            AnalyticsConstants.Events.Navigated.Params.FROM to from.toConstant(),
            AnalyticsConstants.Events.Navigated.Params.TO to to.toConstant()
        ),
        listOf(AnalyticsProvider.ANALYTICS_ALPHA) // We have a limit of events in ANALYTICS_BETA, that's why we send this event only to ALPHA
    ) {
        enum class NavigationSource {
            HOME,
            DASHBOARD,
            NOTIFICATIONS;

            fun toConstant(): String =
                when (this) {
                    HOME -> AnalyticsConstants.Events.Navigated.NavigationSources.HOME
                    DASHBOARD -> AnalyticsConstants.Events.Navigated.NavigationSources.DASHBOARD
                    NOTIFICATIONS -> AnalyticsConstants.Events.Navigated.NavigationSources.NOTIFICATIONS
                }
        }
    }
}