package com.example.ytproject.Model.SearchModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Badge {
    @SerializedName("text")
    @Expose
    var text: String? = null

    @SerializedName("type")
    @Expose
    var type: String? = null
}