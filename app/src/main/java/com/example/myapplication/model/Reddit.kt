package com.example.myapplication.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Reddit {
    @SerializedName("campaign")
    @Expose
    var campaign: String? = null

    @SerializedName("launch")
    @Expose
    var launch: Any? = null

    @SerializedName("media")
    @Expose
    var media: Any? = null

    @SerializedName("recovery")
    @Expose
    var recovery: Any? = null

}