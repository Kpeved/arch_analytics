package com.lolkek.core_analytics.di

import com.lolkek.core_analytics.AnalyticsSender
import com.lolkek.core_analytics.dummy.AnalyticsAlphaDummy
import com.lolkek.core_analytics.dummy.AnalyticsBetaDummy
import org.koin.dsl.module

object AnalyticsModule {
    fun createModule() = module {
        single { AnalyticsAlphaDummy() }
        single { AnalyticsBetaDummy() }
        single { AnalyticsSender(get(), get()) }
    }
}