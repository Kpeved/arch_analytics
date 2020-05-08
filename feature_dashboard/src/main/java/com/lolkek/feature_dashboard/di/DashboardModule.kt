package com.lolkek.feature_dashboard.di

import com.lolkek.feature_dashboard.ui.DashboardViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

object DashboardModule {
    fun createModules(): List<Module> = listOf(
        module {
            viewModel { DashboardViewModel() }
        }
    )
}