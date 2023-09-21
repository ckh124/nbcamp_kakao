package com.example.nbcamp_kakao.search

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.nbcamp_kakao.Repository

class SearchViewModelFactory (
    private val repository: Repository
        ): ViewModelProvider.Factory{


    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return SearchViewModel(repository) as T
    }


}