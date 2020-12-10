package com.example.myapplication.remote

import com.example.myapplication.model.Response
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface PaoService{
    @GET("/v4/launches")
    fun getArticleDetail(): Single<Response>
}