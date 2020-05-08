package com.lolkek.feature_notifications.di

import com.lolkek.feature_notifications.analytics.NotificationsAnalyticsInteractor
import com.lolkek.feature_notifications.ui.NotificationsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

object NotificationsModule {
    fun createModules(): List<Module> = listOf(
        module {
            viewModel { NotificationsViewModel(get(), get()) }
            factory { NotificationsAnalyticsInteractor(get()) }
        }
    )
}