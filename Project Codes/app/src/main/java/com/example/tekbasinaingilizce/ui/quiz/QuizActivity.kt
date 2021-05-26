package com.example.tekbasinaingilizce.ui.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.tekbasinaingilizce.Model.Question
import com.example.tekbasinaingilizce.R
import com.example.tekbasinaingilizce.ui.result.ResultActivity
import com.example.tekbasinaingilizce.util.Constants
import com.google.android.material.chip.Chip
import kotlinx.android.synthetic.main.activity_quiz.*

class QuizActivity : AppCompatActivity() {
    private lateinit var viewModel: QuizViewModel
    private var questionList:List<Question> = arrayListOf()
    private var qIndex = 0
    private var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        viewModel = ViewModelProviders.of(this).get(QuizViewModel::class.java)

        viewModel.allQuestions.observe(this, Observer {

            if (it.isNotEmpty()){

                questionList=it
                setViews()

                next_btn.setOnClickListener {
                    val answer = findViewById<Chip>(chip_group.checkedChipId)
                    chip_group.clearCheck()
                    checkAnswer(answer)
                    qIndex++

                    if (qIndex<questionList.size)setViews()
                    else {
                        val intent = Intent(this,ResultActivity::class.java)
                        intent?.putExtra(Constants.EXTRA_RESULT,score)
                        intent?.putExtra(Constants.EXTRA_LİST_SİZE,questionList.size)
                        startActivity(intent)
                        finish()
                    }

                }
            }
        })
    }

private fun checkAnswer(cevap:Chip){
    if (questionList[qIndex].ansver== cevap.text){
        Toast.makeText(this,"Doğru cevap",Toast.LENGTH_LONG).show()
        score++
    }
    else{Toast.makeText(this,"Doğru cevap\n Cevap = ${questionList[qIndex].ansver}",Toast.LENGTH_LONG).show()}
}

    private fun setViews(){
        question_tv.text = questionList[qIndex].question
        cevap_a_chip.text = questionList[qIndex].answerA
        cevap_b_chip.text = questionList[qIndex].answerB
        cevap_c_chip.text = questionList[qIndex].answerC
    }
}