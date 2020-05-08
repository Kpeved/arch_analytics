package com.lolkek.archanalytics.di

import com.lolkek.archanalytics.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

object MainActivityModule {
    fun createModule() = module {
        viewModel { MainViewModel() }
    }
}