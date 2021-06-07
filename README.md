# ArchAnalytics

This is an example project for an article [An Amaizing Analytics Architecture for Android app](https://proandroiddev.com/an-amazing-analytics-architecture-for-android-app-part-1-6c4304739de6)

## Architecture overview

Architecture consists out of 4 layers : Core, Events, Features and App. Core layer has no idea about other layers outside of Core.
![image](https://github.com/Kpeved/arch_analytics/blob/master/art/architecture.png)

At the same time Feature layer knows about Events layer, which is responsible for analytics. `Feature_dashboard` has a layer `feature_dashboard_analytics` , etc.
Those modules are responsible solely for tracking analytics events. That's how we can separate those entities between each other and do not pollute main feature module with analytics.  