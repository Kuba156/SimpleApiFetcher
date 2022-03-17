package com.example.simpleapifetcher.data.di

import com.example.simpleapifetcher.data.apiservices.ApiService
import com.example.simpleapifetcher.data.repositories.ReposRepositoryImpl
import com.example.simpleapifetcher.domain.repositories.ReposRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module(includes = [NetworkModule::class])
class ApiModule {

    @Provides
    fun bindApiService(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }

    @Provides
    fun bindRepository(repositoryImpl: ReposRepositoryImpl): ReposRepository {
        return repositoryImpl
    }
}