package com.maeun.recyclerview_self_chat

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var item : ArrayList<Item>
    lateinit var adapter : Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        item = ArrayList()

        btn.setOnClickListener{
            item.add(Item(chat_edittext.getText().toString()))
            Toast.makeText(applicationContext,"btn_clicked",Toast.LENGTH_SHORT).show()
            Log.w("버튼","클릭")
            System.out.println("테스트")
            System.out.println(item.size)
            adapter.notifyDataSetChanged()
            chat_edittext.setText("")
            chat_room.scrollToPosition(item.size-1)
        }

        adapter = Adapter(item)
        chat_room.layoutManager = LinearLayoutManager(this)
        chat_room.adapter = adapter
    }
}
