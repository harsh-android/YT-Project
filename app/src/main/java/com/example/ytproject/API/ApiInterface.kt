package com.example.ytproject.API

import com.example.ytproject.Model.SearchModel.SearchModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface ApiInterface {

    @GET("search")
    fun getSearchResults(
        @Query("q") q: String,
        @Header("apikey") apikey: String
    ): Call<SearchModel>

}