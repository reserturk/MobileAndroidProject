package com.example.tekbasinaingilizce.Model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "questions")
data class Question (

    @PrimaryKey(autoGenerate = true)
    var qid:Int=0,

var question:String,

    @ColumnInfo(name = "ansver_a")
    var answerA:String,
    @ColumnInfo(name = "ansver_b")
    var answerB:String,
    @ColumnInfo(name = "ansver_c")
    var answerC:String,

    var ansver:String
        )


