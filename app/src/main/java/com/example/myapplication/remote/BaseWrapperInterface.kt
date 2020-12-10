package com.example.myapplication.remote

import org.json.JSONArray
import java.io.Serializable

interface BaseWrapperInterface : Serializable {
    fun onSuccess(response: Any?)
    fun onFailure(t: Throwable?, className: String?)
    fun onException(s: String?, calledMethod: String?)
}