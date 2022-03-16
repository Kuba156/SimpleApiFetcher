package com.example.simpleapifetcher.data.apiservices

import com.example.simpleapifetcher.data.models.UserRepositoryDTO
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface ApiService {

    @GET("2.0/repositories?fields=values.name,values.owner,values.description")
    fun getRepos(): Single<UserRepositoryDTO>
}