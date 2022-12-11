package com.example.ytproject.Model.SearchModel

import com.google.gson.annotations.SerializedName
import com.google.gson.annotations.Expose
import com.example.ytproject.Model.SearchModel.Avatar
import com.example.ytproject.Model.SearchModel.Badge
import com.example.ytproject.Model.SearchModel.FilterGroup
import com.example.ytproject.Model.SearchModel.Author
import com.example.ytproject.Model.SearchModel.MovingThumbnail
import com.example.ytproject.Model.SearchModel.Thumbnail

class Video {
    @SerializedName("author")
    @Expose
    var author: Author? = null

    @SerializedName("badges")
    @Expose
    var badges: List<String>? = null

    @SerializedName("descriptionSnippet")
    @Expose
    var descriptionSnippet: String? = null

    @SerializedName("isLiveNow")
    @Expose
    var isLiveNow: Boolean? = null

    @SerializedName("lengthSeconds")
    @Expose
    var lengthSeconds: Int? = null

    @SerializedName("movingThumbnails")
    @Expose
    var movingThumbnails: List<MovingThumbnail>? = null

    @SerializedName("publishedTimeText")
    @Expose
    var publishedTimeText: String? = null

    @SerializedName("stats")
    @Expose
    var stats: Stats? = null

    @SerializedName("thumbnails")
    @Expose
    var thumbnails: List<Thumbnail>? = null

    @SerializedName("title")
    @Expose
    var title: String? = null

    @SerializedName("videoId")
    @Expose
    var videoId: String? = null
}