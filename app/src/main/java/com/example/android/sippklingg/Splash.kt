package com.example.android.sippklingg

import android.net.Uri
import android.net.Uri.parse
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.view.WindowManager
import android.widget.VideoView

class Splash : AppCompatActivity() {
    lateinit var videoView: VideoView
    abstract class Uri : Parcelable, Comparable<Uri>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splash)

        supportActionBar?.hide()

        videoView = findViewById(R.id.videoView)

        //var video = parse( "android.resource://"; + packageName + "/" + R.raw.splashkedua)
    }
}
