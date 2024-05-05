package com.example.imada2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val start = findViewById<Button>(R.id.startButton)

start.setOnClickListener{          //Checks if the button was clicked and executes the code in it
    val intent = Intent(this, secondscreen::class.java)  // Open up the second screen
    startActivity(intent)
}
    }
}