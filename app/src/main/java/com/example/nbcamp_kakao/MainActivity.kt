package com.example.nbcamp_kakao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.nbcamp_kakao.databinding.MainActivityBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: MainActivityBinding

    private val viewPagerAdapter by lazy{
        MainViewPagerAdapter(this@MainActivity)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
    }

    private fun initView() = with(binding){
        viewPager.adapter = viewPagerAdapter
        TabLayoutMediator(tabLayout,viewPager){ tab, position ->
            tab.setText(viewPagerAdapter.getTitle(position))
        }.attach()


    }
}