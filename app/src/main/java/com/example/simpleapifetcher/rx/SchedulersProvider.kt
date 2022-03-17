package com.example.simpleapifetcher.rx

import io.reactivex.rxjava3.core.Scheduler


interface SchedulersProvider {
    fun ui(): Scheduler
    fun io(): Scheduler
    fun computation(): Scheduler
}