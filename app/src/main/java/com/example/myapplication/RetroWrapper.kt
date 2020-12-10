package com.example.myapplication

import android.content.Context
import androidx.lifecycle.MutableLiveData
import com.example.myapplication.model.Response
import com.example.myapplication.remote.ApiClient
import com.google.gson.Gson
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RetroWrapper {
    var mContext: Context? = null
    var retrofit: Retrofit? = null
    var listener: Any? = null

    constructor(context: Context?, listener: Any, serverUrl: String) {
        this.mContext = context
        this.listener = listener
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        val httpClient = OkHttpClient.Builder()
        if (BuildConfig.DEBUG) {
            httpClient.addInterceptor(httpLoggingInterceptor) // <-- this is the important line!
        }

        httpClient.writeTimeout(60, TimeUnit.SECONDS)
        httpClient.readTimeout(60, TimeUnit.SECONDS)
        httpClient.connectTimeout(60, TimeUnit.SECONDS)
//        httpClient.addInterceptor(httpLoggingInterceptor)
        retrofit = Retrofit.Builder()
            .baseUrl(serverUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .client(httpClient.build())
            .build()
    }

    constructor(context: Context?, listener: Any) : this(
        context, listener, context!!.getString(R.string.baseUrl)
    )

    fun updateProfile(): Call<List<Response>?>? {
        var futureResponseCall: Call<List<Response>?>? = null
        try {
            val appInterface: ApiClient =
                retrofit!!.create<ApiClient>(ApiClient::class.java)
            futureResponseCall = appInterface.updateUserRequest()
            futureResponseCall?.enqueue(listener as Callback<List<Response>?>)
        } catch (e: java.lang.Exception) {
            e.printStackTrace()
        }
        return futureResponseCall
    }

}