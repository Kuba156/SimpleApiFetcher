package com.example.simpleapifetcher.data.mappers

import com.example.simpleapifetcher.data.models.UserRepositoryDTO
import com.example.simpleapifetcher.domain.models.UserRepository
import javax.inject.Inject

class UserRepositoryMapper @Inject constructor() {

    fun toUserRepository(userRepositoryDTO: UserRepositoryDTO): UserRepository {
        return UserRepository(
            repositoryName = userRepositoryDTO.name,
            userName = userRepositoryDTO.owner?.displayName,
            avatarURL = userRepositoryDTO.owner?.links?.avatar?.href,
            description = userRepositoryDTO.description
        )
    }
}