package com.example.simpleapifetcher.data.repositories

import com.example.simpleapifetcher.data.apiservices.ApiService
import com.example.simpleapifetcher.data.mappers.UserRepositoryMapper
import com.example.simpleapifetcher.domain.models.UserRepository
import com.example.simpleapifetcher.domain.repositories.ReposRepository
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class ReposRepositoryImpl @Inject constructor(
    private val apiService: ApiService, // remember this is an interface
    private val userRepositoryMapper: UserRepositoryMapper
) : ReposRepository {
    override fun getRepos(): Single<UserRepository> {
        return apiService.getRepos().map {
            userRepositoryMapper.toUserRepository(it)
        }
    }
}