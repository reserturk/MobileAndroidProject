package com.example.tekbasinaingilizce.ViewModel

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tekbasinaingilizce.R
import kotlinx.android.synthetic.main.activity_sifir.*
import kotlinx.android.synthetic.main.konu1anlatim.*
var selectedGlobalBitmap : Bitmap?=null
class konu1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konu1)

        val intent = intent
        val gelenText= intent.getStringExtra("konu1Text")
        //textView3.text=gelenText


    }
}