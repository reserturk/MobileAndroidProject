package com.example.tekbasinaingilizce


import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tekbasinaingilizce.ViewModel.RecyclerAdapter
import kotlinx.android.synthetic.main.activity_ana_ekran.*


class AnaEkran : AppCompatActivity() {

    private lateinit var recyclerAdapter: RecyclerAdapter
    private lateinit var newsList: ArrayList<NewsModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ana_ekran)
init()
    }

    private fun init(){
        newsList = ArrayList()
        newsList.add(NewsModel("ALFABE TEMEL SESLER","Bu konunun içerisinde İngilizce Alfabe bulunmaktadır, ve Türkçe ile farkları anlatılmaktadır.","Başlangıç (Ders 1)",R.drawable.a1));
        newsList.add(NewsModel("Cümle Yapısı Ve Çeşitleri","Cümle yapıları ve çeşitleri","Başlangıç (Ders 2)",R.drawable.a1));
        newsList.add(NewsModel("Gelişmiş Cümle Yapısı","İngilizce'de Gelişmiş cümle kurma yapısı","Başlangıç (Ders 3)",R.drawable.a1));
        newsList.add(NewsModel("Subject-Özne","Özne'nin nedir? Konu Anlatım.","Temel (Ders 4)",R.drawable.a2));
        newsList.add(NewsModel("Fiil-Kelimeler","En çok kullanılan Filler","Temel (Ders 5)",R.drawable.a2));
        newsList.add(NewsModel("Geniş Zaman","Simple Present Tense Nedir? Konu Anlatımı.","Temel (Ders 6)",R.drawable.a2));
        newsList.add(NewsModel("Can - Can't Kullanımı","Can ve Can't  Konu Anlatım","Orta (Ders 7)",R.drawable.b));
        newsList.add(NewsModel("Superlatives Comparatives","Superlatives Comparatives Konu Anlatım","Orta (Ders 8)",R.drawable.b));
        newsList.add(NewsModel("Past Perfect Continuous","Past Perfect Continuous Konu Anlatım","İleri (Ders 9)",R.drawable.c));
        newsList.add(NewsModel("Present Perfect Continuous Tense","Present Perfect Continuous Tense Konu Anlatım","İleri (Ders 10)",R.drawable.c));

        setupRecyclerView()
    }

    private fun setupRecyclerView(){
        recyclerAdapter = RecyclerAdapter(this, newsList)
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.adapter = recyclerAdapter
        recyclerview.setHasFixedSize(true)
    }
}