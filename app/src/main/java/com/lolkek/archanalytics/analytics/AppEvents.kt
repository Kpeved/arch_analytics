package com.lolkek.archanalytics.analytics

import com.lolkek.core_analytics.AnalyticsEvent
import com.lolkek.core_analytics.AnalyticsProvider
import com.lolkek.core_analytics_constants.AnalyticsConstants

object AppEvents {
    object FirstLaunch : AnalyticsEvent(AnalyticsConstants.Events.FirstLaunch.EVENT)
    object SessionStart : AnalyticsEvent(AnalyticsConstants.Events.SessionStart.EVENT)

    class Navigated(  // here we specify all possible properties. We know that event can't send anything else - only these fields with these types
        from: NavigationSource,
        to: NavigationSource
    ) : AnalyticsEvent(
        AnalyticsConstants.Events.Navigated.EVENT, // this is the name of event from constants layer.
        mapOf(
            AnalyticsConstants.Events.Navigated.Params.FROM to from.toConstant(),
            AnalyticsConstants.Events.Navigated.Params.TO to to.toConstant()
        ),
        listOf(AnalyticsProvider.ANALYTICS_FIREBASE) // We have a limit of events in AMPLITUDE, that's why we send this event only to FIREBASE
    ) {
        enum class NavigationSource {
            HOME,
            DASHBOARD,
            NOTIFICATIONS;

            fun toConstant(): String = // mapping to event constants
                when (this) {
                    HOME -> AnalyticsConstants.Events.Navigated.NavigationSources.HOME
                    DASHBOARD -> AnalyticsConstants.Events.Navigated.NavigationSources.DASHBOARD
                    NOTIFICATIONS -> AnalyticsConstants.Events.Navigated.NavigationSources.NOTIFICATIONS
                }
        }
    }
}