package com.example.ytproject.Model.SearchModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Author {
    @SerializedName("avatar")
    @Expose
    var avatar: List<Avatar>? = null

    @SerializedName("badges")
    @Expose
    var badges: List<Badge>? = null

    @SerializedName("canonicalBaseUrl")
    @Expose
    var canonicalBaseUrl: Any? = null

    @SerializedName("channelId")
    @Expose
    var channelId: String? = null

    @SerializedName("title")
    @Expose
    var title: String? = null
}