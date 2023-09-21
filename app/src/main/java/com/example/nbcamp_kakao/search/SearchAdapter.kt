package com.example.nbcamp_kakao.search

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.nbcamp_kakao.databinding.SearchItemBinding
import kotlinx.coroutines.NonDisposableHandle.parent

class SearchAdapter():ListAdapter<SearchModel,SearchAdapter.ViewHolder>(
    object : DiffUtil.ItemCallback<SearchModel>(){
        override fun areContentsTheSame(
            oldItem: SearchModel,
            newItem: SearchModel): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areItemsTheSame(
            oldItem: SearchModel,
            newItem: SearchModel): Boolean {
            return oldItem == newItem
        }
    }
) {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        return ViewHolder(
            SearchItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    class ViewHolder(
        private val binding: SearchItemBinding
        ):RecyclerView.ViewHolder(binding.root){


    }



}