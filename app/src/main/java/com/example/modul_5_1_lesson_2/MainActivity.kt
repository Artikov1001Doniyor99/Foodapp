package com.example.modul_5_1_lesson_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        add_food_A.setOnClickListener {
            startActivity(Intent(this,SecondActivity::class.java))
        }

        menu_A.setOnClickListener {
            startActivity(Intent(this,ThirdActivity::class.java))
        }

    }
}