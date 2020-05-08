package com.lolkek.archanalytics

import androidx.lifecycle.ViewModel
import com.lolkek.archanalytics.analytics.MainAnalyticsInteractor

class MainViewModel(
    private val analyticsInteractor: MainAnalyticsInteractor
) : ViewModel() {

    fun destinationChanged(destinationId: Int) {
        analyticsInteractor.destinationChanged(destinationId)
    }

    fun sessionStarted() {
        analyticsInteractor.sessionStarted()
    }
}