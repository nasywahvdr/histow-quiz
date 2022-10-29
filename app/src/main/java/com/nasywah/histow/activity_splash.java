package com.nasywah.histow;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class activity_splash extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private int loading=2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent home = new Intent(activity_splash.this, Menu.class);
                startActivity(home);
                finish();
            }
        },loading);

        mediaPlayer = MediaPlayer.create(activity_splash.this,R.raw.splash);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mediaPlayer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mediaPlayer.pause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mediaPlayer.stop();
        mediaPlayer.release();
    }


}
