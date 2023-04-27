package com.example.api_res_kotlin

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DogAdapter (private val image: List<String>?):
RecyclerView.Adapter<DogViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
      val view:View=  LayoutInflater.from(parent.context)
          .inflate(R.layout.item_dog,parent,false)
        return  DogViewHolder(view)
    }

    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        holder.bind((image!![position]))
    }

    override fun getItemCount(): Int {
        return  image?.size?:0
    }

}