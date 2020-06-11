/*
Find updates by running:
    ./gradlew buildSrcVersions
 */

object Modules {
    const val core = ":core"
    const val coreUi = ":core_ui"
    const val coreNetwork = ":core_network"
    const val coreAnalytics = ":core_analytics"
    const val coreAnalyticsConstants = ":core_analytics_constants"

    const val featureDashboard = ":feature_dashboard"
    const val featureDashboardAnalytics = ":feature_dashboard_analytics"

    const val featureHome = ":feature_home"
    const val featureHomeAnalytics = ":feature_home_analytics"

    const val featureNotifications = ":feature_notifications"
    const val featureNotificationsAnalytics = ":feature_notifications_analytics"
}

object Versions {
    const val kotlin = "1.3.70"
    const val compileSdk = 29
    const val targetSdk = 29
    const val minSdk = 21
    const val buildTools = "29.0.3"

    const val androidGradlePlugin = "3.5.3"
    const val gradleVersionPlugin = "0.27.0"

    const val coreKtx = "1.2.0-rc01"
    const val fragmentKtx = "1.2.0-rc01"
    const val androidXConstraintLayout = "2.0.0-beta4"
    const val appCompat = "1.2.0-alpha01"
    const val recyclerView = "1.1.0"
    const val swipeRefreshLayout = "1.1.0-beta01"

    const val navigation = "2.3.0-alpha03"
    const val material = "1.2.0-alpha05"
    const val retrofit = "2.7.1"
    const val okhttpLogging = "4.3.0"

    const val koin = "2.1.3"
    const val timber = "4.7.1"
    const val lottie = "3.3.1"

    const val viewModel = "2.2.0"

    const val coroutines = "0.22.5"
    const val coroutinesReactive = "1.3.3"

    const val paris = "1.4.0"

    const val mpAndroidChart = "v3.1.0"

    const val junit = "4.13"
    const val junitExt = "1.1.1"
    const val espresso = "3.2.0"

    const val firebaseAnalytics = "17.2.3"
    const val firebaseCrashlytics = "17.0.0-beta02"
    const val firebaseMessaging = "20.1.3"
}

object Deps {

    val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.androidGradlePlugin}"
    val gradleVersionsPlugin = "com.github.ben-manes:gradle-versions-plugin:${Versions.gradleVersionPlugin}"
    val safeArgsPlugin = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}"

    val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    val fragmentKtx = "androidx.fragment:fragment-ktx:${Versions.fragmentKtx}"
    val androidXConstraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.androidXConstraintLayout}"
    val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"

    val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerView}"
    val swipeRefreshLayout = "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.swipeRefreshLayout}"

    val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    val retrofitGsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    val okhttpLogging = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttpLogging}"

    val koinScope = "org.koin:koin-androidx-scope:${Versions.koin}"
    val koinViewModel = "org.koin:koin-androidx-viewmodel:${Versions.koin}"
    val koinFragment = "org.koin:koin-androidx-fragment:${Versions.koin}"
    val koinCore = "org.koin:koin-core:${Versions.koin}"
    val koinExt = "org.koin:koin-core-ext:${Versions.koin}"

    val timber = "com.jakewharton.timber:timber:${Versions.timber}"
    val lottie = "com.airbnb.android:lottie:${Versions.lottie}"

    val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.viewModel}"
    val livedata = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.viewModel}"
    val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.viewModel}"

    val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    val coroutinesReactive = "org.jetbrains.kotlinx:kotlinx-coroutines-reactive:${Versions.coroutinesReactive}"

    val material = "com.google.android.material:material:${Versions.material}"
    val navigationFragment = "androidx.navigation:navigation-fragment:${Versions.navigation}"
    val navigationFragmentKtx = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    val navigationUi = "androidx.navigation:navigation-ui:${Versions.navigation}"
    val navigationUiKtx = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"


    val paris = "com.airbnb.android:paris:${Versions.paris}"

    val mpAndroidChart = "com.github.PhilJay:MPAndroidChart:${Versions.mpAndroidChart}"

    val junit = "junit:junit:${Versions.junit}"
    val junitExt = "androidx.test.ext:junit:${Versions.junitExt}"
    val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"

    val firebaseAnalytics = "com.google.firebase:firebase-analytics:${Versions.firebaseAnalytics}"
    val firebaseCrashlytics = "com.google.firebase:firebase-crashlytics:${Versions.firebaseCrashlytics}"
    val firebaseMessaging = "com.google.firebase:firebase-messaging:${Versions.firebaseMessaging}"
}