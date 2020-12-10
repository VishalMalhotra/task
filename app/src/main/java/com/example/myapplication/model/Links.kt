package com.example.myapplication.model

class Links {
    var patch: Patch? = null
    var webcast: String? = null
    var flickr: Flickr? = null
    var reddit: Reddit? = null
    var wikipedia: String? = null
    var youtube_id: String? = null
    var presskit: String? = null
    var article: String? = null

    override fun toString(): String {
        return "ClassPojo [patch = $patch, webcast = $webcast, flickr = $flickr, reddit = $reddit, wikipedia = $wikipedia, youtube_id = $youtube_id, presskit = $presskit, article = $article]"
    }
}