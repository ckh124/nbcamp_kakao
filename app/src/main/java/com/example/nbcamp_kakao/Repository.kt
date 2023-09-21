package com.example.nbcamp_kakao

import com.example.nbcamp_kakao.api.RetrofitInstance
import com.example.nbcamp_kakao.model.ImageSearchResponse
import retrofit2.Response

class Repository {
    suspend fun searchImage(query: String,sort: String): Response<ImageSearchResponse> {
        return RetrofitInstance.api.searchImage(query = query, sort=sort, page = 1 , size = 8)
    }
}