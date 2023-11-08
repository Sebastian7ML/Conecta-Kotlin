package com.example.conecta.AndroidPath

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.example.conecta.R

class AndroidVideo : AppCompatActivity() {

    lateinit var videoView: VideoView
    private var videoUrl = "https://www.youtube.com/watch?v=LE-Vzl2AmHQ"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_video)

        videoView = findViewById(R.id.vvAndroid)
        val uri: Uri = Uri.parse(videoUrl)
        videoView.setVideoURI(uri)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        mediaController.setMediaPlayer(videoView)
        videoView.setMediaController(mediaController)
        videoView.start()
    }
}