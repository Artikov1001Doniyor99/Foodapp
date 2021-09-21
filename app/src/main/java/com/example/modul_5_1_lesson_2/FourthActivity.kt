package com.example.modul_5_1_lesson_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import kotlinx.android.synthetic.main.activity_fourth.*

class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        supportActionBar?.hide()
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        MySharedPreference.init(this)
        val list = MySharedPreference.obyekString
        val position = intent.getIntExtra("position",0)
        palov.text = list[position].name
        tv_first.text = list[position].ingredient
        tv_second.text = list[position].preparationOrder


    }
}