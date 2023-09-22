package com.example.mad_practical_7_22172012041

import android.media.session.MediaController
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.VideoView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var webView:WebView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            val mediaController = android.widget.MediaController(this)
            val uri:Uri = Uri.parse("android.resource://" + packageName + R.raw.thestoryoflight)
            val myVideoView = findViewById<VideoView>(R.id.video)
            mediaController.setAnchorView(myVideoView)
            myVideoView.setVideoURI(uri)
            myVideoView.requestFocus()
            myVideoView.start()

    }
}