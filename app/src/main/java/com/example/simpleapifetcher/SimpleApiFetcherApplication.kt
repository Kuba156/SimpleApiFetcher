package com.example.simpleapifetcher

import com.example.simpleapifetcher.presentation.di.AppComponent
import com.example.simpleapifetcher.presentation.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.HasAndroidInjector

class SimpleApiFetcherApplication : DaggerApplication(), HasAndroidInjector {

    private lateinit var appComponent: AppComponent

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        appComponent = DaggerAppComponent.builder()
            .application(this)
            .build()
        return appComponent
    }


}