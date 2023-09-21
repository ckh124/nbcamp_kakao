package com.example.nbcamp_kakao.model

import com.google.gson.annotations.SerializedName

class ImageSearchResponse(
    @SerializedName("meta")
    val metaData: MetaData?,
    @SerializedName("documents")
    val documents: MutableList<KakaoImage>?
)
