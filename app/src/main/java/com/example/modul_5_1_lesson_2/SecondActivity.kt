package com.example.modul_5_1_lesson_2


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Toast
import com.muddzdev.styleabletoast.StyleableToast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        MySharedPreference.init(this)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        supportActionBar?.title = "Taom qo'shish"

       save_S.setOnClickListener {

           val name =  food_name.text.toString().trim()
           val product = need_product.text.toString().trim()
           val preOrder = product_make.text.toString().trim()

           if(name != ""  && product != "" && preOrder != ""){

               val list = MySharedPreference.obyekString

               list.add(Food(name,product,preOrder))
               MySharedPreference.obyekString = list
               StyleableToast.makeText(this, "Save", Toast.LENGTH_SHORT, R.style.mytoast_a).show();
               finish()
           }else{
               StyleableToast.makeText(this, "Insufficient information", Toast.LENGTH_SHORT, R.style.mytoast_b).show();
           }

       }

    }
}

