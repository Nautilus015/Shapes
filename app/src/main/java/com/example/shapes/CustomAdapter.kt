package com.example.shapes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter (var list : ArrayList<MyData>)
    : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recycle_item,parent,false))
    }

    class ViewHolder(itemVeiw: View): RecyclerView.ViewHolder(itemVeiw) {
        val shapeimg : ImageView = itemVeiw.findViewById(R.id.image1)
        val shapeimg2 : ImageView = itemVeiw.findViewById(R.id.image2)
        val shapename : TextView = itemVeiw.findViewById(R.id.text1)
        val shapename2 : TextView = itemVeiw.findViewById(R.id.text2)
    }

    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {
        holder.shapeimg.setImageResource(list[position].shapeimg)
        holder.shapeimg2.setImageResource(list[position].shapeimg2)
        holder.shapeimg.setOnClickListener{
            holder.shapename.text = list[position].shapename
        }
        holder.shapeimg2.setOnClickListener{
            holder.shapename2.text = list[position].shapename2
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}