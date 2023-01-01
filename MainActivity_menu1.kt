package com.example.pleasegod

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity_menu1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu1)

        // Menu 1-1) 모던 락시크 룩
        val intent4 = Intent(this, menu1_1::class.java )
        val buttonView4 = findViewById<Button>(R.id.button4)
        buttonView4.setOnClickListener{
            startActivity(intent4)
        }

        // Menu 1-2) 미니멀 룩
        val intent5 = Intent(this, menu1_2::class.java )
        val buttonView5 = findViewById<Button>(R.id.button5)
        buttonView5.setOnClickListener{
            startActivity(intent5)
        }

        // Menu 1-3) 스트릿 패션
        val intent6 = Intent(this, menu1_3::class.java )
        val buttonView6 = findViewById<Button>(R.id.button6)
        buttonView6.setOnClickListener{
            startActivity(intent6)
        }

//        val backBtn = findViewById<Button>(R.id.button)
//        backBtn.setOnClickListener {
//            finish()
//        }
    }
}