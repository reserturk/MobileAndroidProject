package com.example.tekbasinaingilizce.Model

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.tekbasinaingilizce.R
import java.util.*

class konu2anlatim : Fragment() {
  // var view: View? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

      val a = inflater.inflate(R.layout.konu1anlatim, container, false)
      val b = inflater.inflate(R.layout.konu1anlatim, container, false)
      val c = inflater.inflate(R.layout.konu1anlatim, container, false)
        var fr = ArrayList<View>()
        fr.add(a)
        fr.add(b)
        fr.add(c)
      for (i in 0 until fr.size) {
          if (i==0){
              fr.get(0)
          }
          else if (i==1)
          {
              fr.get(1)
          }

      }

      return view
    }
}