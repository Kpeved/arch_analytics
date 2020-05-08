package com.lolkek.feature_home.di

import com.lolkek.feature_home.ui.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

object HomeModule {
    fun createModules(): List<Module> = listOf(
        module {
            viewModel { HomeViewModel() }
        }
    )
}