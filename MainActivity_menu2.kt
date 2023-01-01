package com.example.pleasegod

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity_menu2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu2)

        val gotoNext = Intent(this, menu2::class.java )
        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            startActivity(gotoNext)
        }
    }
}