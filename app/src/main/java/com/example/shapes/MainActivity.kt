package com.example.shapes

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recycleview : RecyclerView
    lateinit var itemlist : ArrayList<MyData>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        itemlist= ArrayList()
        itemlist.add(MyData(R.drawable.circle,R.drawable.pentagon,"circle","pentagon"))
        itemlist.add(MyData(R.drawable.rectangle,R.drawable.square,"rectangle","square"))
        itemlist.add(MyData(R.drawable.star,R.drawable.triangle,"star","triangle"))
        recycleview=findViewById(R.id.recycleview)
        recycleview.layoutManager= LinearLayoutManager(this,RecyclerView.VERTICAL,false)
        recycleview.adapter=CustomAdapter(itemlist)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}