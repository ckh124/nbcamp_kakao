package com.example.nbcamp_kakao.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.nbcamp_kakao.model.ImageSearchResponse
import com.example.nbcamp_kakao.Repository
import kotlinx.coroutines.launch
import retrofit2.Response
import java.util.concurrent.atomic.AtomicLong

class SearchViewModel(private val repository: Repository):ViewModel() {

    val myCustomPosts : MutableLiveData<Response<ImageSearchResponse>> = MutableLiveData()
    val list: LiveData<List<SearchModel>> get() = myCustomPosts

    fun searchImage(query:String){
        viewModelScope.launch{
            val response = repository.searchImage(query,"accuracy")
            myCustomPosts.value = response
        }
    }

}