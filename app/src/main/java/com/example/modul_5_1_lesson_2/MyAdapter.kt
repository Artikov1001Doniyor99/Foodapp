package com.example.modul_5_1_lesson_2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.item.view.*

class MyAdapter(context: Context,val list:List<Food>):ArrayAdapter<Food>(context,R.layout.item,list) {




    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {



        var itemView:View

        if(convertView == null){
            itemView = LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false)
        }else{
            itemView = convertView
        }

        itemView.tx_name.text = list[position].name

        return itemView
    }

}