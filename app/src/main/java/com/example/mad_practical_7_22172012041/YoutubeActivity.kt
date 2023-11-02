package com.example.mad_practical_7_22172012041

import android.content.Intent
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class YoutubeActivity : AppCompatActivity() {
    val youtubeId = "https://www.youtube.com/watch?v=6mbwJ2xhgzM"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)
        initYoutubePlayer()

        val button:FloatingActionButton = findViewById(R.id.youtubetomain)
        button.setOnClickListener{
            Intent(this,MainActivity::class.java).also { startActivity(it) }
        }

    }
    fun initYoutubePlayer() {
        val youtubeWebView: WebView = findViewById(R.id.YtVideo)
        val webSettings: WebSettings = youtubeWebView.settings
        webSettings.javaScriptEnabled = true
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true
        youtubeWebView.loadUrl("https://www.youtube.com/embed/$youtubeId")
    }
}
