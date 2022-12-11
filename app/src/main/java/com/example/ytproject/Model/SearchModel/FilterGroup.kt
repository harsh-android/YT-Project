package com.example.ytproject.Model.SearchModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class FilterGroup {
    @SerializedName("filters")
    @Expose
    var filters: List<Filter>? = null

    @SerializedName("title")
    @Expose
    var title: String? = null
}