package com.example.simpleapifetcher.domain.repositories

import com.example.simpleapifetcher.domain.models.UserRepository
import io.reactivex.rxjava3.core.Single

interface ReposRepository {
    fun getRepos(): Single<UserRepository>
}