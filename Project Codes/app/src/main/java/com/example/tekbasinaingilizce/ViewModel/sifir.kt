package com.example.tekbasinaingilizce.ViewModel

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.drawable.toDrawable
import com.example.tekbasinaingilizce.R
import kotlinx.android.synthetic.main.activity_sifir.*
import kotlinx.android.synthetic.main.konu1anlatim.*
import java.io.ByteArrayOutputStream

class sifir : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sifir)

        val intent = intent
        val gelentext= intent.getStringExtra("k1text")
        //textView3.text=gelentext

/*
        */
       // imageView3.setImageBitmap(selectedGlobalBitmap)










    }



}