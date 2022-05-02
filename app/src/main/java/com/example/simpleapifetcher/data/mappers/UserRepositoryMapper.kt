package com.example.simpleapifetcher.data.mappers

import com.example.simpleapifetcher.data.models.BitbucketResponse
import com.example.simpleapifetcher.domain.models.UserRepository
import io.reactivex.rxjava3.core.Single
import javax.inject.Inject

class UserRepositoryMapper @Inject constructor() {

    fun toUserRepository(bitbucketResponse: Single<BitbucketResponse>): Single<List<UserRepository>> {
        return bitbucketResponse.map { userRepo ->
            userRepo.values.map {
                UserRepository(
                    repositoryName = it.name,
                    userName = it.owner?.displayName,
                    avatarURL = it.owner?.links?.avatar?.href,
                    description = it.description
                )
            }
        }
    }
}