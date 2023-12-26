package com.example.view_pager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
private lateinit var viewPager:ViewPager2
private lateinit var tabLayout: TabLayout
private lateinit var viewPagerAdapter:ViewPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewPager=findViewById(R.id.view_pager)
        tabLayout=findViewById(R.id.tab_layout)
        viewPagerAdapter= ViewPagerAdapter(this)
        viewPager.adapter=viewPagerAdapter
        TabLayoutMediator(tabLayout,viewPager){tab:TabLayout.Tab,position:Int->
            when (position){
                0->tab.text="First"
                1->tab.text="second"
                2->tab.text="Third"
            }

        }.attach()
    }
}