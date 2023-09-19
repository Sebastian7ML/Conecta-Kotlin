package com.example.conecta.lesson2

import android.net.Uri
import android.net.Uri.parse
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import com.example.conecta.R

class AndroidVideo : AppCompatActivity() {

    lateinit var videoView: VideoView
    var videoUrl = "https://www.youtube.com/watch?v=LE-Vzl2AmHQ"

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.android_video)

        videoView = findViewById(R.id.vvAndroid)
        val uri: Uri = parse(videoUrl)
        videoView.setVideoURI(uri)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        mediaController.setMediaPlayer(videoView)
        videoView.setMediaController(mediaController)
        videoView.start()
    }
}