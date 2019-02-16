package com.example.android.sippklingg;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.view.WindowManager;
import android.widget.VideoView;

public class Spalashdua extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_spalashdua);

        videoView = findViewById(R.id.videoVieww);

        Uri Video = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.splashkedua);

        videoView.setVideoURI(Video);

        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                jump();
            }
        });
        videoView.start();
    }

    private void jump(){
        if (isFinishing())
            return;
        startActivity(new Intent(this, Test.class));
        finish();
    }
}
