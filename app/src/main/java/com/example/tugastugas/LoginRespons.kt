package com.example.tugastugas


import com.google.gson.annotations.SerializedName

data class LoginRespons(
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("success")
    val success: Boolean
) {
    data class Data(
        @SerializedName("email")
        val email: String,
        @SerializedName("_id")
        val id: String,
        @SerializedName("token")
        val token: String,
        @SerializedName("username")
        val username: String
    )
}