package com.example.tugastugas


import com.google.gson.annotations.SerializedName

data class RegisterReques(
    @SerializedName("email")
    val email: String,
    @SerializedName("password")
    val password: String,
    @SerializedName("username")
    val username: String
)