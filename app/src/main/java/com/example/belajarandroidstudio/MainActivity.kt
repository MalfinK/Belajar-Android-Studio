package com.example.belajarandroidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_world)

        // mendapatkan id dari file hello_world
        // R.id.nameEditText

        // mau ambil semua view nya dari id yang sudah di tambahkan di hello_world
        val nameEditText: EditText = findViewById(R.id.nameEditText)
        val sayHelloButton: Button = findViewById(R.id.sayHelloButton)
        val sayHelloTextView: TextView = findViewById(R.id.sayHelloTextView)

        sayHelloTextView.text = "Hi"
    }
}