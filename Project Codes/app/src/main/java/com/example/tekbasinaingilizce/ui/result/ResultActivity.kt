package com.example.tekbasinaingilizce.ui.result

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tekbasinaingilizce.R
import com.example.tekbasinaingilizce.util.Constants
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        intent?.extras.let {
            var result = intent?.extras?.getInt(Constants.EXTRA_RESULT)
            var listsize = intent?.extras?.getInt(Constants.EXTRA_LİST_SİZE)
            result_tv.text = "$listsize sorudan $result tanesini bildiniz."
        }


    }

}