package com.example.nbcamp_kakao.search

import com.google.gson.annotations.SerializedName

data class SearchModel (
    @SerializedName("display_sitename")
    val sitename : String,
    val collection : String,
    val image_url : String,

        )
