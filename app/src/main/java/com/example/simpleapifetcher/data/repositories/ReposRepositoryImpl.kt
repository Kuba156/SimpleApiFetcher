package com.example.simpleapifetcher.data.repositories

import com.example.simpleapifetcher.data.apiservices.ApiService
import com.example.simpleapifetcher.data.mappers.UserRepositoryMapper
import com.example.simpleapifetcher.domain.models.UserRepository
import com.example.simpleapifetcher.domain.repositories.ReposRepository
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class ReposRepositoryImpl @Inject constructor(
    private val apiService: ApiService,
    private val userRepositoryMapper: UserRepositoryMapper
) : ReposRepository {
    override fun getRepos(): Single<List<UserRepository>> {
        val repos = apiService.getRepos()
        return userRepositoryMapper.toUserRepository(repos)
    }
}