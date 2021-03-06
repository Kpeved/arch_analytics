package com.lolkek.archanalytics

import android.app.Application
import com.lolkek.archanalytics.analytics.AppEvents
import com.lolkek.archanalytics.di.MainActivityModule
import com.lolkek.core.SharedPreferencesWrapper
import com.lolkek.core_analytics.AnalyticsSender
import com.lolkek.core_analytics.di.AnalyticsModule
import com.lolkek.feature_dashboard.di.DashboardModule
import com.lolkek.feature_home.di.HomeModule
import com.lolkek.feature_notifications.di.NotificationsModule
import org.koin.android.ext.android.inject
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import timber.log.Timber

class ArchAnalyticsApplication : Application() {

    private val analyticsSender: AnalyticsSender by inject()
    private val preferences: SharedPreferencesWrapper by inject()

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
        startKoin {
            androidLogger()
            androidContext(this@ArchAnalyticsApplication)
            modules(
                listOf(
                    ApplicationModule.createModule(),
                    MainActivityModule.createModule(),
                    AnalyticsModule.createModule(),
                    *HomeModule.createModules().toTypedArray(),
                    *DashboardModule.createModules().toTypedArray(),
                    *NotificationsModule.createModules().toTypedArray()
                )
            )
        }

        if (preferences.firstLaunch) {
            sendFirstLaunchEvent()
            preferences.firstLaunch = false
        }
    }

    private fun sendFirstLaunchEvent() {
        analyticsSender.sendEvent(AppEvents.FirstLaunch)
    }
}