package com.example.ytproject.Model.SearchModel

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import com.example.ytproject.Model.SearchModel.Avatar
import com.example.ytproject.Model.SearchModel.Badge
import com.example.ytproject.Model.SearchModel.FilterGroup
import com.example.ytproject.Model.SearchModel.Author
import com.example.ytproject.Model.SearchModel.MovingThumbnail
import com.example.ytproject.Model.SearchModel.Thumbnail

class Thumbnail {
    @SerializedName("height")
    @Expose
    var height: Int? = null

    @SerializedName("url")
    @Expose
    var url: String? = null

    @SerializedName("width")
    @Expose
    var width: Int? = null
}