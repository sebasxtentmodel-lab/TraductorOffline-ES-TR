package com.traductor.offline

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputText = findViewById<EditText>(R.id.inputText)
        val outputText = findViewById<TextView>(R.id.outputText)
        val translateButton = findViewById<Button>(R.id.translateButton)

        translateButton.setOnClickListener {
            val text = inputText.text.toString().trim()

            if (text.isEmpty()) {
                outputText.text = "Escribe algo para traducir."
                return@setOnClickListener
            }

            outputText.text = TranslationEngine.translate(text)
        }
    }
}
