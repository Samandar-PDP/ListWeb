package com.example.noteappwithsharedpref.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageView
import com.example.noteappwithsharedpref.R
import com.example.noteappwithsharedpref.model.Item

class ItemAdapter(
    context: Context,
    private val itemList: MutableList<Item>
) : BaseAdapter() {
    private val layoutInflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    override fun getCount(): Int {
        return itemList.size
    }

    override fun getItem(pos: Int): Item {
        return itemList[pos]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(pos: Int, p1: View?, viewGroup: ViewGroup): View {
        val view = layoutInflater.inflate(R.layout.item_layout, viewGroup, false)
        val title: TextView = view.findViewById(R.id.textTitle)
        val time: TextView = view.findViewById(R.id.textTime)
        val imageView: AppCompatImageView = view.findViewById(R.id.imageView)
        val item = getItem(pos)
        title.text = item.title
        time.text = item.time
        imageView.setImageResource(item.image)
        return view
    }
}