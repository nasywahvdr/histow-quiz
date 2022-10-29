package com.nasywah.histow;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class QuizSulit extends AppCompatActivity implements View.OnClickListener{

    String[] niceArray = {
            "b","a","d","c","b","d","a","d","b","d"
    };

    ImageView gambar,circle1,circle2,circle3,circle4,circle5,circle6,circle7,circle8,circle9,circle10;
    Button a,b,c,d;
    int cek2=0, bener=0;
    String temp;

    protected void setQuestion(){
        switch(cek2)
        {
            case 0 :
                gambar.setImageResource(R.drawable.soal1b);
                circle1.setImageDrawable(getResources().getDrawable(R.drawable.circle_orange));
                circle2.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle3.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle4.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle5.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle6.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle7.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle8.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle9.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle10.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));

                a.setText("9 November");
                b.setText("10 November");
                c.setText("8 November");
                d.setText("7 November");
                break;
            case 1 :
                gambar.setImageResource(R.drawable.soal2b);
                circle1.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle2.setImageDrawable(getResources().getDrawable(R.drawable.circle_orange));
                circle3.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle4.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle5.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle6.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle7.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle8.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle9.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle10.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));

                a.setText("Muhammadiyah");
                b.setText("Nahdatul Ulama");
                c.setText("Sarikat Dagang Islam");
                d.setText("Partai Nasional Indonesia");
                break;
            case 2 :
                gambar.setImageResource(R.drawable.soal3b);
                circle1.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle2.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle3.setImageDrawable(getResources().getDrawable(R.drawable.circle_orange));
                circle4.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle5.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle6.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle7.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle8.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle9.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle10.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));

                a.setText("Sri Sultan HB VII");
                b.setText("Sri Sultan");
                c.setText("Sri Sultan HB VIII");
                d.setText("Sri Sultan HB IX");
                break;
            case 3 :
                gambar.setImageResource(R.drawable.soal4b);
                circle1.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle2.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle3.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle4.setImageDrawable(getResources().getDrawable(R.drawable.circle_orange));
                circle5.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle6.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle7.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle8.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle9.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle10.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));

                a.setText("Jenderal Tri Sutrisn");
                b.setText("Jenderal Suharto");
                c.setText("Jenderal Sudirman");
                d.setText("Jenderal Susilo Bambang Yudhoyono");
                break;
            case 4 :
                gambar.setImageResource(R.drawable.soal5b);
                circle1.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle2.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle3.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle4.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle5.setImageDrawable(getResources().getDrawable(R.drawable.circle_orange));
                circle6.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle7.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle8.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle9.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle10.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));

                a.setText("Ir. Soekarno");
                b.setText("Sutan Syahrir");
                c.setText("Moh. Hatta");
                d.setText("KH. Mas Mansyur");
                break;

            case 5 :
                gambar.setImageResource(R.drawable.soal6b);
                circle1.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle2.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle3.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle4.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle5.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle6.setImageDrawable(getResources().getDrawable(R.drawable.circle_orange));
                circle7.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle8.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle9.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle10.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));

                a.setText("Ir. Soekarno");
                b.setText("Moh Yamin");
                c.setText("Moh Hatta");
                d.setText("Ki Hajar Dewantoro");
                break;
            case 6 :
                gambar.setImageResource(R.drawable.soal7b);
                circle1.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle2.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle3.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle4.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle5.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle6.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle7.setImageDrawable(getResources().getDrawable(R.drawable.circle_orange));
                circle8.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle9.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle10.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));

                a.setText("21 April 1879");
                b.setText("20 April 1869");
                c.setText("20 April 1879");
                d.setText("21 April 1869");
                break;
            case 7 :
                gambar.setImageResource(R.drawable.soal8b);
                circle1.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle2.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle3.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle4.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle5.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle6.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle7.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle8.setImageDrawable(getResources().getDrawable(R.drawable.circle_orange));
                circle9.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle10.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));

                a.setText("Moh Hatta - Ki Hajar Dewantoro");
                b.setText("Soekarno - Moh Yamin");
                c.setText("Moh Hatta - Moh Yamin");
                d.setText("Soekarno - Moh Hatta");
                break;
            case 8 :
                gambar.setImageResource(R.drawable.soal9b);
                circle1.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle2.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle3.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle4.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle5.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle6.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle7.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle8.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle9.setImageDrawable(getResources().getDrawable(R.drawable.circle_orange));
                circle10.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));

                a.setText("Soeharto");
                b.setText("Ir. Soekarno");
                c.setText("Ki Hajar Dewantoro");
                d.setText("Moh Hatta");
                break;
            case 9 :
                gambar.setImageResource(R.drawable.soal10b);
                circle1.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle2.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle3.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle4.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle5.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle6.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle7.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle8.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle9.setImageDrawable(getResources().getDrawable(R.drawable.circle_grey));
                circle10.setImageDrawable(getResources().getDrawable(R.drawable.circle_orange));

                a.setText("Kebodohan dan Kejahatan");
                b.setText("Kejahatan dan Kemiskinan");
                c.setText("Penjajah dan Kebodohan");
                d.setText("Kebodohan dan Kemiskinan");
                break;


            default:
                break;
        }
    }
    protected void trueAnswer()
    {
        bener +=10;

    }
    protected void falseAnswer()
    {
        bener+=0;
    }
    protected void checkAnswer(){
        if(temp.equals(niceArray[cek2]))
        {
            trueAnswer();
        }else{
            temp="";
            falseAnswer();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_sulit);

        a = (Button) findViewById(R.id.a);
        b = (Button)findViewById(R.id.b);
        c = (Button)findViewById(R.id.c);
        d = (Button)findViewById(R.id.d);
        gambar = (ImageView)findViewById(R.id.picture);
        circle1 = (ImageView)findViewById(R.id.circle1mc);
        circle2 = (ImageView)findViewById(R.id.circle2mc);
        circle3 = (ImageView)findViewById(R.id.circle3mc);
        circle4 = (ImageView)findViewById(R.id.circle4mc);
        circle5 = (ImageView)findViewById(R.id.circle5mc);
        circle6 = (ImageView)findViewById(R.id.circle6mc);
        circle7 = (ImageView)findViewById(R.id.circle7mc);
        circle8 = (ImageView)findViewById(R.id.circle8mc);
        circle9 = (ImageView)findViewById(R.id.circle9mc);
        circle10 = (ImageView)findViewById(R.id.circle10mc);

        setQuestion();

        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.a :
                temp ="a";
                checkAnswer();
                cek2++;
                if(cek2>9){
                    cek2=0;
                    Intent intent = new Intent(this,QuizHasil.class);
                    intent.putExtra("nilai",bener);
                    intent.putExtra("gambar",R.drawable.piala);
                    startActivity(intent);
                    finish();
                }else
                {

                    setQuestion();
                }
                break;
            case R.id.b :
                temp = "b";
                checkAnswer();
                cek2++;
                if(cek2>9){
                    cek2=0;
                    Intent intent = new Intent(this,QuizHasilSulit.class);
                    intent.putExtra("nilai",bener);
                    intent.putExtra("gambar",R.drawable.piala);
                    startActivity(intent);
                    finish();
                }else
                {

                    setQuestion();
                }
                break;
            case R.id.c :
                temp ="c";
                checkAnswer();
                cek2++;
                if(cek2>9){
                    cek2=0;
                    Intent intent = new Intent(this,QuizHasilSulit.class);
                    intent.putExtra("nilai",bener);
                    intent.putExtra("gambar",R.drawable.piala);
                    startActivity(intent);
                    finish();
                }else
                {

                    setQuestion();
                }
                break;
            case R.id.d :
                temp = "d";
                checkAnswer();
                cek2++;
                if(cek2>9){
                    cek2=0;
                    Intent intent = new Intent(this,QuizHasilSulit.class);
                    intent.putExtra("nilai",bener);
                    intent.putExtra("gambar",R.drawable.piala);
                    startActivity(intent);
                    finish();
                }else
                {
                    setQuestion();
                }
                break;
            default:break;
        }
    }
    public void onBackPressed() {
        Context c= this;
        AlertDialog.Builder alert = new AlertDialog.Builder(c);
        alert.setMessage("Anda menekan tombol Kembali (Back), silahkan selesaikan Kuis terlebih dahulu.");
        alert.setCancelable(false);
        alert.setNegativeButton("Ok...", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        alert.show();
    }
}