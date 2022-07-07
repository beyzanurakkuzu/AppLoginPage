package com.beyzaakkuzu.login

import android.app.Application
import androidx.databinding.library.BuildConfig
import timber.log.Timber

class LoginApp: Application() {
    override fun onCreate() {
        super.onCreate()

        //log only on the debug build
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}
