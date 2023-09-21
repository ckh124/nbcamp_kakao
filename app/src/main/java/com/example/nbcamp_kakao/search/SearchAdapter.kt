package com.example.nbcamp_kakao.search

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.nbcamp_kakao.databinding.SearchItemBinding


class SearchAdapter():ListAdapter<SearchModel,SearchAdapter.ViewHolder>(
    object : DiffUtil.ItemCallback<SearchModel>(){
        override fun areContentsTheSame(
            oldItem: SearchModel,
            newItem: SearchModel): Boolean {
            return oldItem.image_url == newItem.image_url
        }

        override fun areItemsTheSame(
            oldItem: SearchModel,
            newItem: SearchModel): Boolean {
            return oldItem == newItem
        }
    }
) {
    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        return ViewHolder(
            SearchItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var item = getItem(position)
        holder.bind(item)
    }



    class ViewHolder(
        private val binding: SearchItemBinding
        ):RecyclerView.ViewHolder(binding.root){


            fun bind(item: SearchModel) = with(binding){
                searchText.text = item.sitename

            }


    }



}