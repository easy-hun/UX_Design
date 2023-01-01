package com.example.pleasegod

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity_menu3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu3)

        val backBtn = findViewById<Button>(R.id.button)
        backBtn.setOnClickListener {
            finish()
        }
    }
}