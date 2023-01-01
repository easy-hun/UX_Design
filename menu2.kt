package com.example.pleasegod

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class menu2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu2)

        val gotoMenu = Intent(this, MainActivity::class.java )
        val backBtn = findViewById<Button>(R.id.button)
        backBtn.setOnClickListener {
            startActivity(gotoMenu)
        }
    }
}