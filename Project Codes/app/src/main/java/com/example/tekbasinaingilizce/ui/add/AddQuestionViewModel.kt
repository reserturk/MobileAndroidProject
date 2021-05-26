package com.example.tekbasinaingilizce.ui.add

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.tekbasinaingilizce.Model.Question

class AddQuestionViewModel(application: Application): AndroidViewModel(application) {

    private val repository:AddQuestionRepository by lazy { AddQuestionRepository(application) }

    fun insert(question: Question) = repository.insertQuestion(question)
}