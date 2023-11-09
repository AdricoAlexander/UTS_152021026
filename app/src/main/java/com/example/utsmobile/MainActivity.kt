package com.example.utsmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCompatButton()
    }

    private fun AppCompatButton() {
        button = findViewById(R.id.loginpage)
        button.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }
    }
}