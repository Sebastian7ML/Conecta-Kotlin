package com.example.conecta.lesson1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.conecta.R
import com.example.conecta.lesson2.LessonTwo

class LessonOne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson_one)

        val btnGo = findViewById<Button>(R.id.btGo)
        btnGo.setOnClickListener {
            navigateToLessonTwo()
            Log.i("s7", "going to fields of action")
        }

    }

    private fun navigateToLessonTwo() {
        val intent = Intent(this, LessonTwo::class.java)
        startActivity(intent)
    }
}