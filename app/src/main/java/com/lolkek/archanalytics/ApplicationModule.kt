package com.lolkek.archanalytics

import com.lolkek.core.SharedPreferencesWrapper
import org.koin.dsl.module

object ApplicationModule {
    fun createModule() = module {
        single { SharedPreferencesWrapper(get()) }
    }
}