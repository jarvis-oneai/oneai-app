package com.nirvana

import android.app.Application
import com.nirvana.BuildConfig
import com.google.firebase.FirebaseApp
import com.segment.analytics.kotlin.android.Analytics
import com.segment.analytics.kotlin.android.plugins.AndroidContextPlugin
import com.segment.analytics.kotlin.android.plugins.FirebasePlugin
import com.segment.analytics.kotlin.android.plugins.LogcatLogger

class NirvanaApp : Application() {

    override fun onCreate() {
        super.onCreate()
        FirebaseApp.initializeApp(this)

        // Segment analytics initialization
        val analytics = Analytics(BuildConfig.SEGMENT_WRITE_KEY) {
            this.application = this@NirvanaApp
            use(AndroidContextPlugin())
            use(FirebasePlugin())
            use(LogcatLogger())
        }

        Analytics.setSingletonInstance(analytics)
    }
}
