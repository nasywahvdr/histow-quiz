package com.nasywah.histow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tentang extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    Button keback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);

        keback = (Button) findViewById(R.id.toback);
        keback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tentang.this, Menu.class));
            }
        });
        mediaPlayer = MediaPlayer.create(Tentang.this,R.raw.mysong);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }
    }
