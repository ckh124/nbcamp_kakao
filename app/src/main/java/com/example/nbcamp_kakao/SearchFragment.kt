package com.example.nbcamp_kakao

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.nbcamp_kakao.databinding.BookmarkFragmentBinding
import com.example.nbcamp_kakao.databinding.SearchFragmentBinding

class SearchFragment:Fragment() {

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
    }


}