package com.example.belajarandroidstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var sayHelloButton: Button
    private lateinit var sayHelloTextView: TextView

    private fun initComponents() {
        // mau ambil semua view nya dari id yang sudah di tambahkan di hello_world
        nameEditText = findViewById(R.id.nameEditText)
        sayHelloButton = findViewById(R.id.sayHelloButton)
        sayHelloTextView = findViewById(R.id.sayHelloTextView)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_world)

        // mendapatkan id dari file hello_world
        // R.id.nameEditText

        initComponents()

        sayHelloTextView.text = "Hi"

        sayHelloButton.setOnClickListener {
            val name = nameEditText.text.toString()
            sayHelloTextView.text = "Hi $name"
        }
    }
}