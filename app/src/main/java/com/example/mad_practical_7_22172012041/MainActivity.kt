package com.example.mad_practical_7_22172012041
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button:FloatingActionButton = findViewById(R.id.changebutton)
        val mediaController = MediaController(this)
        val uri: Uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.thestoryoflight)
        val myVideoview:VideoView = findViewById<VideoView>(R.id.video)
        mediaController.setAnchorView(myVideoview)
        myVideoview.setVideoURI(uri)
        myVideoview.requestFocus()
        myVideoview.start()

        button.setOnClickListener{
            Intent(this,YoutubeActivity::class.java).also { startActivity(it) }        }
    }
}