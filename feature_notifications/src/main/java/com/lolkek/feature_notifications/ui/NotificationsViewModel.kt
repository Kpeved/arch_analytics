package com.lolkek.feature_notifications.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lolkek.core.SharedPreferencesWrapper
import com.lolkek.feature_notifications.analytics.NotificationsAnalyticsInteractor

class NotificationsViewModel(
    private val spWrapper: SharedPreferencesWrapper,
    private val analyticsInteractor: NotificationsAnalyticsInteractor
) : ViewModel() {

    private val _notificationState = MutableLiveData<Boolean>().apply {
        value = spWrapper.notificationState
    }

    val notificationState: LiveData<Boolean> = _notificationState

    fun toggleNotification() {
        val newState = !(_notificationState.value ?: true)
        analyticsInteractor.sendNotificationChanged(newState)
        spWrapper.notificationState = newState
        _notificationState.value = newState
    }
}