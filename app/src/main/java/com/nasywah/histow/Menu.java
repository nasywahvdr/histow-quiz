package com.nasywah.histow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    Button kemulai, keabout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        kemulai = (Button) findViewById(R.id.tomulai);
        kemulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this, Daftar.class));
            }
        });

        keabout = (Button) findViewById(R.id.toabout);
        keabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Menu.this, Tentang.class));
            }
        });

        mediaPlayer = MediaPlayer.create(Menu.this,R.raw.mysong);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }
}