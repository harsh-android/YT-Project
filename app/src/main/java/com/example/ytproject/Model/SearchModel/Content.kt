package com.example.ytproject.Model.SearchModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Content {
    @SerializedName("type")
    @Expose
    var type: String? = null

    @SerializedName("video")
    @Expose
    var video: Video? = null
}