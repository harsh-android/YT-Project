package com.example.ytproject.Model.SearchModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Filter {
    @SerializedName("cursorSelect")
    @Expose
    var cursorSelect: String? = null

    @SerializedName("label")
    @Expose
    var label: String? = null

    @SerializedName("selected")
    @Expose
    var selected: Boolean? = null
}