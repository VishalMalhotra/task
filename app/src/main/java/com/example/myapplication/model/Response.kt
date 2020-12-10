package com.example.myapplication.model

class Response {
    var launchpad: String? = null
    lateinit var payloads: Array<String>
    var rocket: String? = null
    lateinit var crew: Array<String>
    var date_unix: Long = 0
    lateinit var cores: Array<Cores>
    var auto_update: String? = null
    var date_precision: String? = null
    var links: Links? = null
    var details: String? = null
    var id: String? = null
    var net: String? = null
    lateinit var capsules: Array<String>
    var static_fire_date_utc: String? = null
    lateinit var failures: Array<Failures>
    var date_local: String? = null
    var flight_number: String? = null
    var fairings: Fairings? = null
    lateinit var ships: Array<String>
    var date_utc: String? = null
    var static_fire_date_unix: String? = null
    var success: String? = null
    var tbd: String? = null
    var name: String? = null
    var window: String? = null
    var upcoming: String? = null

    override fun toString(): String {
        return "ClassPojo [launchpad = $launchpad, payloads = $payloads, rocket = $rocket, crew = $crew, date_unix = $date_unix, cores = $cores, auto_update = $auto_update, date_precision = $date_precision, links = $links, details = $details, id = $id, net = $net, capsules = $capsules, static_fire_date_utc = $static_fire_date_utc, failures = $failures, date_local = $date_local, flight_number = $flight_number, fairings = $fairings, ships = $ships, date_utc = $date_utc, static_fire_date_unix = $static_fire_date_unix, success = $success, tbd = $tbd, name = $name, window = $window, upcoming = $upcoming]"
    }
}