package com.example.tekbasinaingilizce.ui.quiz

import android.content.Context
import androidx.lifecycle.LiveData
import com.example.tekbasinaingilizce.Data.QuestionsDao
import com.example.tekbasinaingilizce.Data.QuestionsDb
import com.example.tekbasinaingilizce.Model.Question

class QuizRepository(context: Context) {
    private val db:QuestionsDb by lazy { QuestionsDb.getInstance(context ) }
    private val dao:QuestionsDao by lazy {db.questionDao()}

    fun gelAllQuestions(): LiveData<List<Question>> =dao.getQuestions()

}