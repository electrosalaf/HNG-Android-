package com.example.hngstage2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val name = findViewById<EditText>(R.id.edit_text)
    val displayButton = findViewById<Button>(R.id.submit_button)
    val displayMessage = findViewById<TextView>(R.id.text_preview)

    displayButton.setOnClickListener {
      displayMessage.setText("Welcome to the HNGi8 Internship ${name.text}")
    }
  }
}