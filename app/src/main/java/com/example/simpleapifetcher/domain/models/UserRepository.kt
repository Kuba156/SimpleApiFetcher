package com.example.simpleapifetcher.domain.models

data class UserRepository(
    val repositoryName: String? = null,
    val userName: String? = null,
    val avatarURL: String? = null,
    val description: String? = null
) {}
