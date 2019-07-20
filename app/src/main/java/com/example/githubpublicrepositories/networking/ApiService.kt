package com.robertvargic.cryptochecker.networking

import com.example.githubpublicrepositories.data.response.Contributors
import com.example.githubpublicrepositories.data.response.Repository
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("repositories")
    fun getRepositories(
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ): Call<MutableList<Repository>>

    @GET("repos/{owner}/{repo}")
    fun getRepository(
        @Path("owner") owner: String,
        @Path("repo") repo: String
    ): Call<Repository>

    @GET("repos/{owner}/{repo}/contributors")
    fun getRepositoryContributors(
        @Path("owner") owner: String,
        @Path("repo") repo: String
    ): Call<MutableList<Contributors>>

}