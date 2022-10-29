package com.nasywah.histow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class QuizHasilSedang extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    String name;
    ImageView gambarr,star1,star2,star3,star4,star5,menu,replay;
    int res,gambarrr;
    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_hasila);

        Bundle extras = getIntent().getExtras();
        if(extras==null)
        {
            return;
        }
        res = extras.getInt("nilai");
        gambarrr = extras.getInt("gambar");

        gambarr = (ImageView)findViewById(R.id.badgew);
        star1 = (ImageView)findViewById(R.id.star1);
        star2 = (ImageView)findViewById(R.id.star2);
        star3 = (ImageView)findViewById(R.id.star3);
        star4 = (ImageView)findViewById(R.id.star4);
        star5 = (ImageView)findViewById(R.id.star5);
        menu = (ImageView)findViewById(R.id.back);
        replay = (ImageView)findViewById(R.id.replay);

        gambarr.setImageResource(gambarrr);

        TextView nilai = (TextView)findViewById(R.id.nilai);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(QuizHasilSedang.this,Daftar.class);
                startActivity(i);
                finish();
            }
        });

        replay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(QuizHasilSedang.this,QuizSedang.class);
                startActivity(i);
                finish();
            }
        });

        nilai.setText(String.valueOf(res));
        if (res >= 100)
        {
            star1.setImageDrawable(getResources().getDrawable(R.drawable.star_on));
            star2.setImageDrawable(getResources().getDrawable(R.drawable.star_on));
            star3.setImageDrawable(getResources().getDrawable(R.drawable.star_on));
            star4.setImageDrawable(getResources().getDrawable(R.drawable.star_on));
            star5.setImageDrawable(getResources().getDrawable(R.drawable.star_on));
        }
        else if (res >= 80)
        {
            star1.setImageDrawable(getResources().getDrawable(R.drawable.star_on));
            star2.setImageDrawable(getResources().getDrawable(R.drawable.star_on));
            star3.setImageDrawable(getResources().getDrawable(R.drawable.star_on));
            star4.setImageDrawable(getResources().getDrawable(R.drawable.star_on));
            star5.setImageDrawable(getResources().getDrawable(R.drawable.star_off));
        }
        else if (res >= 50)
        {
            star1.setImageDrawable(getResources().getDrawable(R.drawable.star_on));
            star2.setImageDrawable(getResources().getDrawable(R.drawable.star_on));
            star3.setImageDrawable(getResources().getDrawable(R.drawable.star_on));
            star4.setImageDrawable(getResources().getDrawable(R.drawable.star_off));
            star5.setImageDrawable(getResources().getDrawable(R.drawable.star_off));
        }
        else if (res >= 30)
        {
            star1.setImageDrawable(getResources().getDrawable(R.drawable.star_on));
            star2.setImageDrawable(getResources().getDrawable(R.drawable.star_on));
            star3.setImageDrawable(getResources().getDrawable(R.drawable.star_off));
            star4.setImageDrawable(getResources().getDrawable(R.drawable.star_off));
            star5.setImageDrawable(getResources().getDrawable(R.drawable.star_off));
        }
        else if (res >= 10)
        {
            star1.setImageDrawable(getResources().getDrawable(R.drawable.star_on));
            star2.setImageDrawable(getResources().getDrawable(R.drawable.star_off));
            star3.setImageDrawable(getResources().getDrawable(R.drawable.star_off));
            star4.setImageDrawable(getResources().getDrawable(R.drawable.star_off));
            star5.setImageDrawable(getResources().getDrawable(R.drawable.star_off));
        }
        else if (res == 0)
        {
            star1.setImageDrawable(getResources().getDrawable(R.drawable.star_off));
            star2.setImageDrawable(getResources().getDrawable(R.drawable.star_off));
            star3.setImageDrawable(getResources().getDrawable(R.drawable.star_off));
            star4.setImageDrawable(getResources().getDrawable(R.drawable.star_off));
            star5.setImageDrawable(getResources().getDrawable(R.drawable.star_off));
        }
        mediaPlayer = MediaPlayer.create(QuizHasilSedang.this,R.raw.win);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();

    }

}
