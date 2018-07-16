package br.com.jonathan.exemploretrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubService {

    @GET("users/{user}/repos")
    fun getRepositorios(@Path("user") user: String): Call<List<Repository>>






}