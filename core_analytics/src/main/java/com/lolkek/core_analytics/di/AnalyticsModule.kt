package com.lolkek.core_analytics.di

import com.lolkek.core_analytics.AnalyticsSender
import com.lolkek.core_analytics.dummy.AnalyticsAmplitudeDummy
import com.lolkek.core_analytics.dummy.AnalyticsFirebaseDummy
import org.koin.dsl.module

object AnalyticsModule {
    fun createModule() = module {
        single { AnalyticsFirebaseDummy() }
        single { AnalyticsAmplitudeDummy() }
        single { AnalyticsSender(get(), get()) }
    }
}