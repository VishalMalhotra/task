package com.example.myapplication.remote

import com.example.myapplication.model.Response
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET


public interface ApiClient {
    @GET("v4/launches")
    fun updateUserRequest(): Call<List<Response>?>?

}