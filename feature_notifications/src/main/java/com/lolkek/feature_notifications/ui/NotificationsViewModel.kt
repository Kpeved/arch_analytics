package com.lolkek.feature_notifications.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lolkek.core.SharedPreferencesWrapper

class NotificationsViewModel(
    private val spWrapper: SharedPreferencesWrapper
) : ViewModel() {

    private val _notificationState = MutableLiveData<Boolean>().apply {
        value = spWrapper.notificationState
    }

    val notificationState: LiveData<Boolean> = _notificationState

    fun toggleNotification() {
        val newState = !(_notificationState.value ?: true)
        spWrapper.notificationState = newState
        _notificationState.value = newState
    }
}