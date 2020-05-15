package com.lolkek.core_analytics_constants

object AnalyticsConstants {
    object Events {
        object FirstLaunch {
            const val EVENT = "first_launch"
        }

        object SessionStart {
            const val EVENT = "session_start"
        }

        object Navigated { // Each event is having its own class
            const val EVENT = "navigated" // this is event name.

            object Params { // this is an object which contains possible parameters. Note: it's not a final list of possible parameters,
                // some parameters can be re-used from other events. The point is to keep all possible constants in this class
                const val FROM = "from"
                const val TO = "to"
            }

            object NavigationSources { // this are possible values of event parameters from and to.
                const val HOME = "home"
                const val DASHBOARD = "dashboard"
                const val NOTIFICATIONS = "notifications"
            }
        }

        object SendClicked {
            const val EVENT = "send_clicked"

            object Params {
                const val TIME_BETWEEN_CLICKS = "time_between_clicks"
            }
        }

        object DashboardRead {
            const val EVENT = "dashboard_read"

            object Params {
                const val TIME_SPENT = "time_spent"
            }
        }

        object NotificationsChanged {
            const val EVENT = "notifications_changed"
        }
    }

    object UserProperties{
        const val NOTIFICATION_STATE = "notification_state" //here we have a list of user properties
    }
}