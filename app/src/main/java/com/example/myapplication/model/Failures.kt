package com.example.myapplication.model

class Failures {
    var altitude: String? = null
    var reason: String? = null
    var time: String? = null

    override fun toString(): String {
        return "ClassPojo [altitude = $altitude, reason = $reason, time = $time]"
    }
}