package com.example.myapplication

import android.content.Context
import android.util.Log
import com.example.myapplication.remote.BaseWrapperInterface
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import retrofit2.Call
import retrofit2.Response


class BaseWrapperClass : retrofit2.Callback<Any> {
    private var context: Context? = null
    private var baseWrapperInterface: BaseWrapperInterface? = null

    constructor(
        context: Context?,
        baseWrapperInterface: BaseWrapperInterface?

    ) {
        this.context = context
        this.baseWrapperInterface = baseWrapperInterface
    }

    override fun onFailure(call: Call<Any>, t: Throwable) {
        Log.e("fdsf",t.toString())

    }

    override fun onResponse(call: Call<Any>, response: Response<Any>) {

        if(response.code()==200){
            Log.e("fdsf","200")
          //  var mainPojo = Gson().fromJson(response.body()!!.toString(), Array<com.example.myapplication.model.Response>::class.java).toList()
            val encRes = response.body() as List<com.example.myapplication.model.Response?>


         /*   val listType = object : TypeToken<ArrayList<com.example.myapplication.model.Response?>?>() {}.type
            val yourClassList: List<com.example.myapplication.model.Response> =
                Gson().fromJson(response.body(), listType)*/


            baseWrapperInterface?.onSuccess(encRes)

        }
    }

    fun updateProfile() {
        try {
            val retroWrapper = RetroWrapper(context, this)
            retroWrapper.updateProfile()
        } catch (e: java.lang.Exception) {
            e.printStackTrace()
        }
    }
}