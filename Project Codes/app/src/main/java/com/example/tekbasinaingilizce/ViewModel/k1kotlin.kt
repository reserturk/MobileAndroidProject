package com.example.tekbasinaingilizce.ViewModel

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.tekbasinaingilizce.Model.Fragmentk1Anlatim
import com.example.tekbasinaingilizce.Model.Fragmentk1Video
import com.example.tekbasinaingilizce.Model.K1wpAdapter
import com.example.tekbasinaingilizce.Model.konu2anlatim
import com.example.tekbasinaingilizce.R
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.tabs.TabLayout

class konu1acti : AppCompatActivity() {
    private var tabLayout: TabLayout? = null
    private var appBarLayout: AppBarLayout? = null
    private var viewPager: ViewPager? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konu1acti)
        tabLayout = findViewById<View>(R.id.tablayout_id) as TabLayout
        appBarLayout = findViewById<View>(R.id.appbarid) as AppBarLayout
        viewPager = findViewById<View>(R.id.viewpaper_id) as ViewPager
        val adapter = K1wpAdapter(supportFragmentManager)
        adapter.AddFragment(Fragmentk1Anlatim(), "ANLATIM")
        adapter.AddFragment(Fragmentk1Video(), "Video")
        adapter.AddFragment(konu2anlatim(), "Anlatım")
        viewPager!!.adapter = adapter
        tabLayout!!.setupWithViewPager(viewPager)
    }


}