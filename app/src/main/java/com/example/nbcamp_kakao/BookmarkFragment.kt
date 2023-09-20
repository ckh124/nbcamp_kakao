package com.example.nbcamp_kakao

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.nbcamp_kakao.databinding.BookmarkFragmentBinding

class BookmarkFragment: Fragment() {
    private var _binding: BookmarkFragmentBinding? = null
    private val binding get() = _binding!!
    companion object{
        fun newInstance() = BookmarkFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = BookmarkFragmentBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }



}