object Modules {
    val core = ":core"
    val coreUi = ":core_ui"

    val featureDashboard = ":feature_dashboard"
    val featureHome = ":feature_home"
    val featureNotifications = ":feature_notifications"
}

object Versions {
    val kotlin = "1.3.70"
    val compileSdk = 29
    val targetSdk = 29
    val minSdk = 21
    val buildTools = "29.0.3"

    val androidGradlePlugin = "3.5.3"

    val coreKtx = "1.2.0-rc01"
    val fragmentKtx = "1.2.0-rc01"
    val androidXConstraintLayout = "2.0.0-beta4"
    val appCompat = "1.2.0-alpha01"

    val navigation = "2.3.0-alpha03"
    val material = "1.2.0-alpha05"

    val koin = "2.1.3"
    val timber = "4.7.1"

    val viewModel = "2.2.0"

    val junit = "4.13"
    val junitExt = "1.1.1"
    val espresso = "3.2.0"
}

object Deps {

    val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.androidGradlePlugin}"

    val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    val fragmentKtx = "androidx.fragment:fragment-ktx:${Versions.fragmentKtx}"
    val androidXConstraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.androidXConstraintLayout}"
    val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"

    val koinScope = "org.koin:koin-androidx-scope:${Versions.koin}"
    val koinViewModel = "org.koin:koin-androidx-viewmodel:${Versions.koin}"
    val koinFragment = "org.koin:koin-androidx-fragment:${Versions.koin}"
    val koinCore = "org.koin:koin-core:${Versions.koin}"
    val koinExt = "org.koin:koin-core-ext:${Versions.koin}"

    val timber = "com.jakewharton.timber:timber:${Versions.timber}"

    val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.viewModel}"
    val livedata = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.viewModel}"
    val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.viewModel}"

    val material = "com.google.android.material:material:${Versions.material}"
    val navigationFragment = "androidx.navigation:navigation-fragment:${Versions.navigation}"
    val navigationFragmentKtx = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    val navigationUi = "androidx.navigation:navigation-ui:${Versions.navigation}"
    val navigationUiKtx = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"

    val junit = "junit:junit:${Versions.junit}"
    val junitExt = "androidx.test.ext:junit:${Versions.junitExt}"
    val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
}