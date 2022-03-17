package com.example.simpleapifetcher.presentation.di

import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton

@Suppress("UNCHECKED_CAST")
@Singleton
class ViewModelFactory @Inject constructor(private val viewModels: MutableMap<Class<out ViewModel>,
        @JvmSuppressWildcards Provider<ViewModel>>): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return viewModels[modelClass]?.get() as T
    }
}

inline fun <reified VM: ViewModel> ViewModelProvider.Factory.obtainViewModel(activity: FragmentActivity):VM{
    return ViewModelProvider(activity).get(VM::class.java)
    // return ViewModelProviders.of(activity, this)[VM::class.java]
}