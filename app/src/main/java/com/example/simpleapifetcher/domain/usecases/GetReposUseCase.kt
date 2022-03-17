package com.example.simpleapifetcher.domain.usecases

import com.example.simpleapifetcher.domain.models.UserRepository
import com.example.simpleapifetcher.domain.repositories.ReposRepository
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class GetReposUseCase @Inject constructor(
    private val reposRepository: ReposRepository
) : SingleUseCase<UserRepository> {

    override fun execute(): Single<UserRepository> {
        return reposRepository.getRepos()
    }
}