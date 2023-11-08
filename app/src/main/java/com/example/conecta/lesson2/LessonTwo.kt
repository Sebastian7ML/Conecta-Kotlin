package com.example.conecta.lesson2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.cardview.widget.CardView
import com.example.conecta.AndroidPath.AndroidVideo
import com.example.conecta.DataSciencePath.DataScienceVideo
import com.example.conecta.MultiPlatformPath.MultiPlatformVideo
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

        val cardTwo = findViewById<CardView>(R.id.cardTwo)
        cardTwo.setOnClickListener {
            showDataScVideo()
            Log.i("s7", "going to Data Science Video")
        }

        val cardFour = findViewById<CardView>(R.id.cardFour)
        cardFour.setOnClickListener {
            showMultiVideo()
            Log.i("s7", "going to MultiPlatform Video")
        }
    }

    fun showAndroidVideo(){
        val intent = Intent(this, AndroidVideo::class.java)
        startActivity(intent)
    }

    fun showMultiVideo(){
        val intent = Intent(this, MultiPlatformVideo::class.java)
        startActivity(intent)
    }

    fun showDataScVideo(){
        val intent = Intent(this, DataScienceVideo::class.java)
        startActivity(intent)
    }

}

