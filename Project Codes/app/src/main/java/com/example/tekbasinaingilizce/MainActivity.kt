package com.example.tekbasinaingilizce


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import com.google.firebase.auth.FirebaseAuth
//import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


//var firebaseAuth: FirebaseAuth?=null


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }





    fun kayit(view: View) {
        val intent1 = Intent(applicationContext, Kayitol::class.java)
        startActivity(intent1);
    }

    fun Kurtarma(view: View) {
        val intent2 = Intent(applicationContext, SifreUnuttum::class.java)
        startActivity(intent2);
    }

    fun Giris(view: View) {
        val intent3 = Intent(applicationContext, AnaEkran::class.java)
        startActivity(intent3);
    }
}