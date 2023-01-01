package com.example.pleasegod

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Menu 1)
        val intent1 = Intent(this, MainActivity_menu1::class.java )
        val buttonView1 = findViewById<Button>(R.id.button1)
        buttonView1.setOnClickListener{
            startActivity(intent1)
        }

        // Menu 2)
        val intent2 = Intent(this, MainActivity_menu2::class.java )
        val buttonView2 = findViewById<Button>(R.id.button2)
        buttonView2.setOnClickListener{
            startActivity(intent2)
        }

        // Menu 3)
        val intent3 = Intent(this, MainActivity_menu3::class.java )
        val buttonView3 = findViewById<Button>(R.id.button3)
        buttonView3.setOnClickListener{
            startActivity(intent3)
        }


    }
}