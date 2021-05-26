package com.example.tekbasinaingilizce.ViewModel

import android.graphics.Bitmap

open class Singleton {

    companion object Selected{
        var SelectedImage : Bitmap? = null
    }
     var bits = ArrayList<Bitmap>()
}