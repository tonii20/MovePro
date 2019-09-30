package com.example.myapplicationj;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView v = (VideoView) findViewById(R.id.videoView2);
        v.setVideoURI(Uri.parse(("android.resource://com.example.myapplicationj/"+R.raw.rofed)));
        v.setMediaController(new MediaController(this));
        v.requestFocus();
        v.start();


     VideoView v1 = (VideoView) findViewById(R.id.videoPlayer);
     v1.setVideoURI(Uri.parse(("android.resource://com.example.myapplicationj/"+R.raw.nodjo)));
        v1.setMediaController(new MediaController(this));
        v1.requestFocus();
        v1.start();


    }

}
