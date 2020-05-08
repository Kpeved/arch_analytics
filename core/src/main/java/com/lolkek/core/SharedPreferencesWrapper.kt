package com.lolkek.core

import android.content.Context
import android.content.SharedPreferences

class SharedPreferencesWrapper(context: Context) {

    private val preferences: SharedPreferences =
        context.getSharedPreferences(KEY_SHARED_PREFS, Context.MODE_PRIVATE)

    var notificationState: Boolean
        get() = preferences.getBoolean(KEY_NOTIFICATION_STATE, false)
        set(value) {
            preferences.putBoolean(KEY_NOTIFICATION_STATE, value)
        }

    companion object {
        private const val KEY_SHARED_PREFS = "shared_prefs"
        private const val KEY_FIRST_LAUNCH = "first_launch"
        private const val KEY_NOTIFICATION_STATE = "notification_state"
    }

}