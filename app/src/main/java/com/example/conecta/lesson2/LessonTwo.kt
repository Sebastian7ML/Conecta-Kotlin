package com.example.conecta.lesson2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.cardview.widget.CardView
import com.example.conecta.R

class LessonTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson_two)

        val cardOne = findViewById<CardView>(R.id.cardOne)
        cardOne.setOnClickListener {
            showAndroidVideo()
            Log.i("s7", "going to Android Video")
        }
    }

    fun showAndroidVideo(){
        val intent = Intent(this, AndroidVideo::class.java)
        startActivity(intent)
    }
}

