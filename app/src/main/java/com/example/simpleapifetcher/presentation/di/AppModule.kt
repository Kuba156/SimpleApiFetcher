package com.example.simpleapifetcher.presentation.di

import android.app.Application
import android.content.Context
import com.example.simpleapifetcher.rx.SchedulersFacade
import com.example.simpleapifetcher.rx.SchedulersProvider
import dagger.Binds
import dagger.Module

@Module
abstract class AppModule {

    @Binds
    abstract fun bindContext(application: Application): Context

    @Binds
    abstract fun providerScheduler(schedulersFacade: SchedulersFacade): SchedulersProvider
}