package com.example.simpleapifetcher.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.simpleapifetcher.domain.models.UserRepository
import com.example.simpleapifetcher.domain.usecases.GetReposUseCase
import com.example.simpleapifetcher.rx.SchedulersProvider
import io.reactivex.rxjava3.disposables.CompositeDisposable
import javax.inject.Inject

class MainViewModel @Inject constructor(
    val getReposUseCase: GetReposUseCase,
    val schedulers: SchedulersProvider
) : ViewModel() {

    val userRepoLiveData = MutableLiveData<List<UserRepository>>()
    protected val compositeDisposable = CompositeDisposable()

    fun getUserRepoData() {
        getReposUseCase.execute()
            .subscribeOn(schedulers.io())
            .subscribe({ ur ->
                userRepoLiveData.postValue(ur)
            }, {
                // error
            }).let {
                compositeDisposable.add(it)
            }
    }

    override fun onCleared() {
        compositeDisposable.clear()
    }

}