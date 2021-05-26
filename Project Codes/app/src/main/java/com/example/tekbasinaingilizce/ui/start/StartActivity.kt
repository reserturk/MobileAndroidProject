package com.example.tekbasinaingilizce.ui.start

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tekbasinaingilizce.R
import com.example.tekbasinaingilizce.ui.add.add_quizActivity
import com.example.tekbasinaingilizce.ui.quiz.QuizActivity
import kotlinx.android.synthetic.main.activity_start.*

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)


        start_quiz_buton.setOnClickListener {
            startActivity(Intent(this,QuizActivity::class.java))
            finish()
        }
        btn_ekle_2.setOnClickListener {
            startActivity(Intent(this,add_quizActivity::class.java))
        }
    }
}