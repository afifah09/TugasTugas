package com.example.tugastugas

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiService {
    @POST("api/v1/auth/login")
    fun postlogin(@Body reques: LoginReques): Call<LoginRespons>
    @POST("api/v1/auth/register")
    fun postregister(@Body reques: RegisterReques): Call<RegisterRespons>
}