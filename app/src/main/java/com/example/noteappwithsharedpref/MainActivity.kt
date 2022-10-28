package com.example.noteappwithsharedpref

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.noteappwithsharedpref.adapter.ItemAdapter
import com.example.noteappwithsharedpref.model.Item

class MainActivity : AppCompatActivity() {
    private lateinit var listView: ListView
    private val itemAdapter by lazy { ItemAdapter(this, xarXil()) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView = findViewById(R.id.listView)
        listView.adapter = itemAdapter
    }

    private fun xarXil(): MutableList<Item> {
        val list = mutableListOf<Item>()
        list.add(Item("Android", "435,234,454", R.drawable.ic_launcher_foreground))
        list.add(Item("OOP", "3423,43241,3432", R.drawable.oop))
        list.add(Item("Green", "32432432", R.drawable.ic_launcher_background))
        return list
    }

    private fun birXil(): MutableList<Item> {
        val list = mutableListOf<Item>()
        repeat(50) {
            list.add(Item("Android", "2020-10-28 | 10-25", R.drawable.ic_launcher_background))
        }
        return list
    }
}