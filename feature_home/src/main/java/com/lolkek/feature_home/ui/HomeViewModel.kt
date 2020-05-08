package com.lolkek.feature_home.ui

import androidx.lifecycle.ViewModel
import com.lolkek.feature_home.analytics.HomeAnalyticsInteractor

class HomeViewModel(
    private val analyticsInteractor: HomeAnalyticsInteractor
) : ViewModel() {

  fun onFragmentCreated(){
    analyticsInteractor.startTracking()
  }

    fun sendData() {
        analyticsInteractor.sendEvent()
    }
}