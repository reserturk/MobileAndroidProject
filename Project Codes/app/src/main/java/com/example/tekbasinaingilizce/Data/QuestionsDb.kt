package com.example.tekbasinaingilizce.Data

import android.content.Context
import android.os.AsyncTask
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.tekbasinaingilizce.Model.Question

@Database(entities = arrayOf(Question::class), version = 1)
abstract class QuestionsDb: RoomDatabase() {

    abstract fun questionDao(): QuestionsDao

    companion object{

        @Volatile
        var INSTANCE:QuestionsDb?=null
        @Synchronized
        fun getInstance(context: Context):QuestionsDb{
            if (INSTANCE==null){
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    QuestionsDb::class.java,
                    "question_db"
                )
                    .addCallback(roomDbCallback)
                    .build()
            }
            return INSTANCE as QuestionsDb
        }
        private val roomDbCallback = object: RoomDatabase.Callback(){
            override fun onCreate(db: SupportSQLiteDatabase) {
                super.onCreate(db)
                PopulateAsyncTask(INSTANCE).execute()

            }
        }
        class PopulateAsyncTask(private val db:QuestionsDb?):AsyncTask<Void, Void, Void>(){
            private val dao:QuestionsDao? by lazy {db?.questionDao()  }
            override fun doInBackground(vararg p0: Void?): Void? {
               // dao?.deleteall()
                var question3 = Question(
                    question = "…….. many books on the desk. You can take a book from there. ",
                    answerA = "There is",
                    answerB = "There are",
                    answerC = "are there",
                    ansver = "There are"
                )
                dao?.addQuestion(question3)

                var question4 = Question(
                    question = "John has a broken leg. He … walk right now. ",
                    answerA = "can ",
                    answerB = "could",
                    answerC = "can’t",
                    ansver = "can’t"
                )
                dao?.addQuestion(question4)

                var question5 = Question(
                    question = "The blue bag is not my sister’s bag. The red bag is … bag. ",
                    answerA = "my",
                    answerB = "her",
                    answerC = "their",
                    ansver = "her"
                )
                dao?.addQuestion(question5)

                return null
            }
        }

    }

}