package com.example.ytproject.API

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiClient {

    companion object {

        var BASE_URL = "https://api.apilayer.com/youtube/"
        var API_KEY = "KIewBjhD86fjSz0cl2c3ST9CQScsKPLm"
        lateinit var retrofit: Retrofit

        fun getApiClient() : Retrofit {

            retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            return retrofit

        }

    }

}