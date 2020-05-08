package com.lolkek.archanalytics.analytics

import com.lolkek.archanalytics.R
import com.lolkek.core_analytics.AnalyticsSender

class MainAnalyticsInteractor(
    private val eventSender: AnalyticsSender
) {
    private var prevDestination: Int? = null

    fun destinationChanged(destinationId: Int) {
        if (destinationId == prevDestination) return

        prevDestination?.let {
            eventSender.sendEvent(
                AppEvents.Navigated(
                    from = getNavigationDestination(it),
                    to = getNavigationDestination(destinationId)
                )
            )
        }
        prevDestination = destinationId
    }

    fun sessionStarted() {
        eventSender.sendEvent(AppEvents.SessionStart)
    }

    private fun getNavigationDestination(destination: Int): AppEvents.Navigated.NavigationSource =
        when (destination) {
            R.id.navigation_home -> AppEvents.Navigated.NavigationSource.HOME
            R.id.navigation_dashboard -> AppEvents.Navigated.NavigationSource.DASHBOARD
            R.id.navigation_notifications -> AppEvents.Navigated.NavigationSource.NOTIFICATIONS
            else -> AppEvents.Navigated.NavigationSource.NOTIFICATIONS
        }
}