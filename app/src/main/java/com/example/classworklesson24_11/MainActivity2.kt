package com.example.classworklesson24_11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatTextView

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val textView = findViewById<AppCompatTextView>(R.id.activity2_txt)

        textView.text = intent.getStringExtra("item")
    }
}