package com.example.tekbasinaingilizce.ViewModel;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.tekbasinaingilizce.Model.K2wpAdapter;
import com.example.tekbasinaingilizce.Model.konu1video;
import com.example.tekbasinaingilizce.Model.konu2anlatim;
import com.example.tekbasinaingilizce.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public class konu1 extends AppCompatActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konu2acti);

        tabLayout = (TabLayout) findViewById(R.id.tablayout_id);
        appBarLayout = (AppBarLayout) findViewById(R.id.appbarid);
        viewPager = (ViewPager) findViewById(R.id.viewpaper_id);
        K2wpAdapter adapter = new K2wpAdapter(getSupportFragmentManager());
        adapter.AddFragment(new com.example.tekbasinaingilizce.Model.konu1(), "ANLATIM");
        adapter.AddFragment(new konu1video(), "Video");


        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}