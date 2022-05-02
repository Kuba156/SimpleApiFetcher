package com.example.simpleapifetcher.presentation.di

import com.example.simpleapifetcher.presentation.activity.MainActivity
import com.example.simpleapifetcher.presentation.fragment.ListFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module(includes = [ViewModelModule::class])
abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract fun provideScreenActivity(): MainActivity

    @ContributesAndroidInjector
    abstract fun provideListFragment(): ListFragment

    //todo: add fragments here?

}