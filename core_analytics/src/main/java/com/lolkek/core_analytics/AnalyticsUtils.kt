package com.lolkek.core_analytics

import java.util.concurrent.TimeUnit

object AnalyticsUtils {
    fun getTimeDurationInSecBetweenNow(startTimeMillis: Long) =
        TimeUnit.SECONDS.convert(System.currentTimeMillis() - startTimeMillis, TimeUnit.MILLISECONDS)
}
