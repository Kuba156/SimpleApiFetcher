package com.example.simpleapifetcher.presentation.di

import android.app.Application
import com.example.simpleapifetcher.SimpleApiFetcherApplication
import com.example.simpleapifetcher.data.di.ApiModule
import com.example.simpleapifetcher.data.di.NetworkModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        NetworkModule::class,
        ApiModule::class,
        AppModule::class,
        AndroidSupportInjectionModule::class,
        AndroidInjectionModule::class,
        ActivityModule::class]
)
interface AppComponent : AndroidInjector<SimpleApiFetcherApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}