package com.example.tekbasinaingilizce.ui.add

import android.content.Context
import android.os.AsyncTask
import com.example.tekbasinaingilizce.Data.QuestionsDao
import com.example.tekbasinaingilizce.Data.QuestionsDb
import com.example.tekbasinaingilizce.Model.Question

class AddQuestionRepository(context: Context) {

    private val db by lazy { QuestionsDb.getInstance(context) }
    private val dao:QuestionsDao by lazy { db.questionDao() }

    fun insertQuestion(question: Question){
InsertAsyncTask(dao).execute(question)
    }
    private class InsertAsyncTask(val dao: QuestionsDao):AsyncTask<Question,Void,Void>(){
        override fun doInBackground(vararg p0: Question?): Void? {
            dao.addQuestion(p0[0]!!)
            return null
        }

    }

}