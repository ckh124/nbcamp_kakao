package com.example.nbcamp_kakao.model

import com.google.gson.annotations.SerializedName

data class KakaoImage(
    @SerializedName("display_sitename")
    val sitename : String,
    val Collection : String,
    val image_url : String
)
