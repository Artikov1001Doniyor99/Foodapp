package com.example.modul_5_1_lesson_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {

    lateinit var myAdapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        supportActionBar?.title = "Barcha taomlar"
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        MySharedPreference.init(this)
        val list = MySharedPreference.obyekString

        myAdapter = MyAdapter(this,list)
        list_food.adapter = myAdapter

        list_food.setOnItemClickListener{ parent,view,position,id ->
            val intent = Intent(this, FourthActivity::class.java)
            intent.putExtra("position",position)
            startActivity(intent)
        }

    }
}