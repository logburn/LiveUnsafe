package com.lukeogburn.liveunsafe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val current = LocalDateTime.now().minusMinutes(1)
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd h:mm a")
        val formatted = current.format(formatter)

        val textView: TextView = findViewById(R.id.datetime) as TextView
        textView.text = formatted
    }
}