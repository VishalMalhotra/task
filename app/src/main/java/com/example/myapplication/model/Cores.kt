package com.example.myapplication.model

class Cores {
    var core: String? = null
    var flight: String? = null
    var landing_type: String? = null
    var gridfins: String? = null
    var landing_attempt: String? = null
    var legs: String? = null
    var landpad: String? = null
    var reused: String? = null
    var landing_success = false

    override fun toString(): String {
        return "ClassPojo [core = $core, flight = $flight, landing_type = $landing_type, gridfins = $gridfins, landing_attempt = $landing_attempt, legs = $legs, landpad = $landpad, reused = $reused, landing_success = $landing_success]"
    }
}