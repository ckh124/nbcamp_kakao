package com.example.nbcamp_kakao.search

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.nbcamp_kakao.Repository
import com.example.nbcamp_kakao.databinding.SearchFragmentBinding
import com.example.nbcamp_kakao.viewmodel.SearchViewModel
import com.example.nbcamp_kakao.viewmodel.SearchViewModelFactory

class SearchFragment:Fragment() {
    private lateinit var viewModel : SearchViewModel
    private var _binding: SearchFragmentBinding? = null
    private val binding get() = _binding!!
    companion object{
        fun newInstance() = SearchFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = SearchFragmentBinding.inflate(inflater,container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }
    private fun initView(){
        val repository = Repository()
        val viewModelFactory = SearchViewModelFactory(repository)
        viewModel = ViewModelProvider(this,viewModelFactory).get(SearchViewModel::class.java)

        binding.searchBtn.setOnClickListener{
            viewModel.searchImage()
        }
        viewModel.myCustomPosts.observe(viewLifecycleOwner, Observer{result ->
            if(result.isSuccessful){
                Log.d("test","$result")
                for(i in result.body()!!.documents!!){
                    Log.d("test2","$i")
                }
            }else{
                Log.d("test3","fail")
            }
        })

    }


}