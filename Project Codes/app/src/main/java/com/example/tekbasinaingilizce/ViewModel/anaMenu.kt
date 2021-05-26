package com.example.tekbasinaingilizce.ViewModel

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.tekbasinaingilizce.AnaEkran
import com.example.tekbasinaingilizce.R


class anaMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ana_menu)



    }

    public fun konulargit(view: View){
        val intent = Intent(applicationContext, AnaEkran::class.java)
        startActivity(intent)

    }
    public fun chatgit(view: View){
        val intent = Intent(applicationContext, com.example.tekbasinaingilizce.chatacti::class.java)
        startActivity(intent)

    }
    public fun quizgit(view: View){
        val intent = Intent(applicationContext, com.example.tekbasinaingilizce.ui.start.StartActivity::class.java)
        startActivity(intent)

    }
}