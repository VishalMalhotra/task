package com.example.myapplication.model

class Fairings {
    var recovered: String? = null
    lateinit var ships: Array<String>
    var recovery_attempt: String? = null
    var reused: String? = null

    override fun toString(): String {
        return "ClassPojo [recovered = $recovered, ships = $ships, recovery_attempt = $recovery_attempt, reused = $reused]"
    }
}