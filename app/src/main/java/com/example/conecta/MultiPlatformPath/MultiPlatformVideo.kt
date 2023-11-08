package com.example.conecta.MultiPlatformPath

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.VideoView
import com.example.conecta.R

class MultiPlatformVideo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multi_platform_video)

        val videoView = findViewById<VideoView>(R.id.multiVV)
        val uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.multiplatform_video)
        videoView.setVideoURI(uri)
        videoView.start()

        // display a toast message
        // after the video is completed
        videoView.setOnCompletionListener {
            Toast.makeText(applicationContext, "Video completed",
                Toast.LENGTH_LONG).show()
            true
        }

    }
}