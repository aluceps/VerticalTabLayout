package me.aluceps.verticaltablayout

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentPagerAdapter
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val pages: List<String> = listOf("月", "火", "水", "木", "金", "土", "日")

    private val pagerAdapter: FragmentPagerAdapter by lazy {
        object : FragmentPagerAdapter(supportFragmentManager) {
            override fun getItem(position: Int): Fragment =
                    PageFragment.newInstance(pages[position])

            override fun getPageTitle(position: Int): CharSequence? = pages[position]

            override fun getCount(): Int = pages.size
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialize()
    }

    private fun initialize() {
        pager.adapter = pagerAdapter
        tab.setupWithViewPager(pager)
    }
}
