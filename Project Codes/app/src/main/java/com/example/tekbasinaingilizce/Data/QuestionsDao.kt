package com.example.tekbasinaingilizce.Data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.tekbasinaingilizce.Model.Question

@Dao
interface QuestionsDao {

    @Query("Select * FROM questions")
    fun getQuestions(): LiveData<List<Question>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun addQuestion(question: Question)

   /* @Query("DELETE FROM questions")
    fun deleteall(question: Question)*/
}