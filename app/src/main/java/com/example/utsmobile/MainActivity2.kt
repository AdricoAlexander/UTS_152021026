package com.example.utsmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast


class MainActivity2 : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var username: EditText
    private lateinit var password: EditText
    private lateinit var check: CheckBox
    private lateinit var regist:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        button = findViewById(R.id.login)
        username = findViewById(R.id.username)
        password = findViewById(R.id.password)
        check = findViewById(R.id.check)
        regist = findViewById(R.id.regist)

        regist.setOnClickListener {
            val intent = Intent(this,MainActivity5::class.java)
            startActivity(intent)
        }


        button.setOnClickListener {
            login()
        }

        check.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                password.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_NORMAL
            } else {
                password.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
            }
        }
    }

    private fun login() {
        val inputUsername = username.text.toString()
        val inputPassword = password.text.toString()

        if (inputUsername == "adrico" && inputPassword == "12345") {
            startActivity(Intent(this, MainActivity4::class.java))
        } else {
            Toast.makeText(this, "Login Gagal, Coba Lagi!", Toast.LENGTH_SHORT).show()
        }
    }
}
