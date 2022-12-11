package com.example.ytproject.Model.SearchModel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class SearchModel {
    @SerializedName("contents")
    @Expose
    var contents: List<Content>? = null

    @SerializedName("cursorNext")
    @Expose
    var cursorNext: String? = null

    @SerializedName("didYouMean")
    @Expose
    var didYouMean: Any? = null

    @SerializedName("estimatedResults")
    @Expose
    var estimatedResults: Int? = null

    @SerializedName("filterGroups")
    @Expose
    var filterGroups: List<FilterGroup>? = null

    @SerializedName("refinements")
    @Expose
    var refinements: List<String>? = null
}