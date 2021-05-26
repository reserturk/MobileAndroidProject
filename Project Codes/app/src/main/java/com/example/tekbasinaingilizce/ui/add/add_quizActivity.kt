package com.example.tekbasinaingilizce.ui.add

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import com.example.tekbasinaingilizce.Model.Question
import com.example.tekbasinaingilizce.R
import kotlinx.android.synthetic.main.activity_add_quiz.*
import kotlinx.android.synthetic.main.activity_quiz.*

class add_quizActivity : AppCompatActivity() {

    private lateinit var viewModel: AddQuestionViewModel

    private lateinit var answer: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_quiz)

viewModel = ViewModelProviders.of(this).get(AddQuestionViewModel::class.java)
        prepareSpiner()
        btn_ekle.setOnClickListener {

            val question = soruadd.text.toString()
            val cevapa = lcevapa.text.toString()
            val cevapb = lcevapb.text.toString()
            val cevapc = lcevapc.text.toString()

            viewModel.insert(
                Question(
                    question = question,
                    answerA = cevapa,
                    answerB = cevapb,
                    answerC = cevapc,
                    ansver = if (answer=="A") cevapa else if (answer=="B") cevapb else cevapc

                )
            )
            Toast.makeText(this,"EKLEME BAŞARILI",Toast.LENGTH_LONG).show()
        }
    }
    private fun prepareSpiner(){
        val appList = mutableListOf<String>("A","B","C")
        val adapter5 = ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,appList)
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter=adapter5

        spinner.onItemSelectedListener=object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                answer = p0?.getItemAtPosition(p2).toString()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
    }
}