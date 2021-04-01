package com.acedillo.example.rest

import com.acedillo.example.model.AvailableUser
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("v3/b852db38-d936-4880-b4ab-13361debe270")
    fun getAvailableUsers(): Call<AvailableUser>

}