package com.lolkek.feature_dashboard.ui

import androidx.lifecycle.ViewModel
import com.lolkek.feature_dashboard.DashboardAnalyticsInteractor

class DashboardViewModel(
    private val analyticsInteractor: DashboardAnalyticsInteractor
) : ViewModel() {

    fun init() {

    }

    fun onFirstTimeCreated(){
        analyticsInteractor.startTracking()
    }

    fun onSaveState() {
        analyticsInteractor.setDontSendEvent()
    }

    fun onDestroy() {
        analyticsInteractor.sendDashboardRead()
    }
}