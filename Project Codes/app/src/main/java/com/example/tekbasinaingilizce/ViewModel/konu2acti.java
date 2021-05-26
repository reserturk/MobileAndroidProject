package com.example.tekbasinaingilizce.ViewModel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.tekbasinaingilizce.Model.Fragmentk1Anlatim;
import com.example.tekbasinaingilizce.Model.Fragmentk1Video;
import com.example.tekbasinaingilizce.Model.K1wpAdapter;
import com.example.tekbasinaingilizce.Model.K2wpAdapter;
import com.example.tekbasinaingilizce.Model.konu1;
import com.example.tekbasinaingilizce.Model.konu2;
import com.example.tekbasinaingilizce.Model.konu2anlatim;
import com.example.tekbasinaingilizce.Model.konu2dinleme;
import com.example.tekbasinaingilizce.Model.konu2okuma;
import com.example.tekbasinaingilizce.Model.konu2video;
import com.example.tekbasinaingilizce.Model.konu3;
import com.example.tekbasinaingilizce.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public class konu2acti extends AppCompatActivity {

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
        K1wpAdapter adapter = new K1wpAdapter(getSupportFragmentManager());
        adapter.AddFragment(new konu2(), "Anlatim");
        adapter.AddFragment(new konu2video(), "Video");
        adapter.AddFragment(new konu2okuma(), "Hikaye");
        adapter.AddFragment(new konu2dinleme(), "Dinle");




        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}