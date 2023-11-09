package com.example.utsmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity5 : AppCompatActivity() {
    private lateinit var back:Button
    private lateinit var regist:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        back = findViewById(R.id.back)
        regist = findViewById(R.id.register)
        regist.setOnClickListener {
            Toast.makeText(this, "Registrasi Berhasil", Toast.LENGTH_SHORT).show()
        }
        back.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)

        }
    }
}