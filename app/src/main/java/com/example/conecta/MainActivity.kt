package com.example.conecta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.conecta.lesson1.LessonOne

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart = findViewById<Button>(R.id.btLetsLearn)
        btnStart.setOnClickListener {

            navigateLessonOne()
            Log.i("s7", "starting lesson one - Why Kotlin?")
        }

    }

    private fun navigateLessonOne() {
        val intent = Intent(this, LessonOne::class.java)
        startActivity(intent)
    }
}