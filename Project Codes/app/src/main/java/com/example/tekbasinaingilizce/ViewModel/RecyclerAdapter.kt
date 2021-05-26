package com.example.tekbasinaingilizce.ViewModel

import android.app.Activity
import android.app.Application
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.content.res.AppCompatResources.getDrawable
import androidx.core.content.ContextCompat.getDrawable
import androidx.core.content.res.ResourcesCompat.getDrawable
import androidx.core.content.res.TypedArrayUtils.getDrawable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.tekbasinaingilizce.AnaEkran
import com.example.tekbasinaingilizce.R
import com.example.tekbasinaingilizce.NewsModel
import com.google.android.material.resources.MaterialResources.getDrawable
import kotlinx.android.synthetic.main.activity_sifir.*
import kotlinx.android.synthetic.main.animated_item.view.*
import java.io.ByteArrayOutputStream
import kotlin.collections.ArrayList


class RecyclerAdapter(var context: Context, var newsList: ArrayList<NewsModel>) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.animated_item, parent, false)
        return ViewHolder(view)

    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = newsList[position]

        holder.itemView.txt_title.text = item.title
        holder.itemView.txt_date.text = item.date
        holder.itemView.txt_desc.text = item.description
        holder.itemView.txt_title.text = item.title
        holder.itemView.imageView.setImageResource(item.image)





        holder.itemView.setOnClickListener {


            val SelectedRec = holder.adapterPosition

            if (SelectedRec == 0) {
                val intent = Intent(holder.itemView.context, konuacti1::class.java)
                holder.itemView.context.startActivity(intent)
            } else if (SelectedRec == 1) {
                val intent = Intent(holder.itemView.context, konu2acti::class.java)
                holder.itemView.context.startActivity(intent)
            } else if (SelectedRec == 2) {
                val intent = Intent(holder.itemView.context, konu3acti::class.java)
                holder.itemView.context.startActivity(intent)
            } else if (SelectedRec == 3) {
                val intent = Intent(holder.itemView.context, konu4acti::class.java)
                holder.itemView.context.startActivity(intent)
            } else if (SelectedRec == 4) {
                val intent = Intent(holder.itemView.context, konu5acti::class.java)
                holder.itemView.context.startActivity(intent)
            } else if (SelectedRec == 5) {
                val intent = Intent(holder.itemView.context, konu6acti::class.java)
                holder.itemView.context.startActivity(intent)
            } else if (SelectedRec == 6) {
                val intent = Intent(holder.itemView.context, konu7acti::class.java)
                holder.itemView.context.startActivity(intent)
            } else if (SelectedRec == 7) {
                val intent = Intent(holder.itemView.context, konu8acti::class.java)
                holder.itemView.context.startActivity(intent)
            } else if (SelectedRec == 8) {
                val intent = Intent(holder.itemView.context, konu9acti::class.java)
                holder.itemView.context.startActivity(intent)
            } else if (SelectedRec == 9) {
                val intent = Intent(holder.itemView.context, konu10acti::class.java)
                holder.itemView.context.startActivity(intent)
            } else if (SelectedRec == 10) {
                val intent = Intent(holder.itemView.context, konu10acti::class.java)
                holder.itemView.context.startActivity(intent)
            }


            //holder.itemView.context.startActivity(intent)
        }

    }

    override fun getItemCount() = newsList.size
}