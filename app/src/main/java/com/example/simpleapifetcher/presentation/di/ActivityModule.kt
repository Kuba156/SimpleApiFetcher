package com.example.simpleapifetcher.presentation.di

import com.example.simpleapifetcher.presentation.activity.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module(includes = [ViewModelModule::class])
abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract fun bindMainScreenActivity(): MainActivity

    //todo: add fragments here?

}