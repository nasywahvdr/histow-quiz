package com.nasywah.histow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Daftar extends AppCompatActivity {
    ImageButton kemudah, kesedang, kesulit, keabout, kehome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        kemudah = (ImageButton) findViewById(R.id.tomudah);
        kemudah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Daftar.this, QuizPilihan.class));
            }
        });

        kesedang = (ImageButton) findViewById(R.id.tosedang);
        kesedang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Daftar.this, QuizSedang.class));
            }
        });

        kesulit = (ImageButton) findViewById(R.id.tosulit);
        kesulit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Daftar.this, QuizSulit.class));
            }
        });

        keabout = (ImageButton) findViewById(R.id.toabout);
        keabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Daftar.this, Tentang.class));
            }
        });

        kehome = (ImageButton) findViewById(R.id.tohome);
        kehome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Daftar.this, Menu.class));
            }
        });

    }

}