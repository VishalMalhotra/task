package com.example.myapplication.repository

import android.app.Application
import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.myapplication.BaseWrapperClass
import com.example.myapplication.model.Response
import com.example.myapplication.remote.BaseWrapperInterface

class MainRepository (val application: Application) : BaseWrapperInterface {


    private var liveDataFromServer: MutableLiveData<List<Response>> = MutableLiveData()

    override fun onSuccess(response: Any?) {
        Log.e("success--",response.toString())
        liveDataFromServer.value = response as List<Response>?

    }

    override fun onFailure(t: Throwable?, className: String?) {
        Log.e("failure--",t.toString()+"   "+className)

    }

    override fun onException(s: String?, calledMethod: String?) {
        Log.e("excep--",s.toString()+"   "+calledMethod)

    }

    fun update(): MutableLiveData<List<Response>> {

        val baseWrapperClass = BaseWrapperClass(
            application, this
        )
        baseWrapperClass.updateProfile()

        return liveDataFromServer
    }

}