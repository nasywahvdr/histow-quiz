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

public class QuizSedang extends AppCompatActivity implements View.OnClickListener{
    private MediaPlayer mediaPlayer;

    String[] niceArray = {
            "b","c","c","b","b","a","b","d","b","d"
    };

    ImageView gambar,circle1,circle2,circle3,circle4,circle5,circle6,circle7,circle8,circle9,circle10;
    Button a,b,c,d;
    int cek2=0, bener=0;
    String temp;

    protected void setQuestion(){
        switch(cek2)
        {
            case 0 :
                gambar.setImageResource(R.drawable.soal1a);
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

                a.setText("Megawati Soekarnoputri");
                b.setText("Joko Widodo");
                c.setText("Jusuf Kalla");
                d.setText("BJ Habibie");
                break;
            case 1 :
                gambar.setImageResource(R.drawable.soal2a);
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

                a.setText("Den Pasar");
                b.setText("Batavia");
                c.setText("Den Haag");
                d.setText("Darwin");
                break;
            case 2 :
                gambar.setImageResource(R.drawable.soal3a);
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

                a.setText("Pattinasarani");
                b.setText("Senopati");
                c.setText("Pattimura");
                d.setText("Pattiunus");
                break;
            case 3 :
                gambar.setImageResource(R.drawable.soal4a);
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

                a.setText("Teuku Cik");
                b.setText("Teuku Johan Pahlawan");
                c.setText("Teuku Pemberani");
                d.setText("Teuku Pahlawan");
                break;
            case 4 :
                gambar.setImageResource(R.drawable.soal5a);
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

                a.setText("Bandung");
                b.setText("Tarakan");
                c.setText("Yogyakarta");
                d.setText("Surabaya");
                break;

            case 5 :
                gambar.setImageResource(R.drawable.soal6a);
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

                a.setText("Jepara");
                b.setText("Kudus");
                c.setText("Semarang");
                d.setText("Demak");
                break;
            case 6 :
                gambar.setImageResource(R.drawable.soal7a);
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

                a.setText("Cut Nya Dien");
                b.setText("R.A. Kartini");
                c.setText("Nyi Ageng Serang");
                d.setText("Cut Mun Ti ah");
                break;
            case 7 :
                gambar.setImageResource(R.drawable.soal8a);
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

                a.setText("Ani Yudoyono");
                b.setText("Dawi Motik");
                c.setText("Megawati");
                d.setText("Dewi Sartika");
                break;
            case 8 :
                gambar.setImageResource(R.drawable.soal9a);
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

                a.setText("Soeharto - Adam Malik");
                b.setText("Soekarno - Hatta");
                c.setText("Hatta - Mr Yamin");
                d.setText("Soedirman - Soetomo");
                break;
            case 9 :
                gambar.setImageResource(R.drawable.soal10a);
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

                a.setText("Kebangkitan Nasional");
                b.setText("Pendidikan Nasional");
                c.setText("Kesaktian Pancasila");
                d.setText("Sumpah Pemuda");
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
        setContentView(R.layout.activity_quiz_sedang);

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
                    Intent intent = new Intent(this,QuizHasilSedang.class);
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
                    Intent intent = new Intent(this,QuizHasilSedang.class);
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
                    Intent intent = new Intent(this,QuizHasilSedang.class);
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
                    Intent intent = new Intent(this,QuizHasilSedang.class);
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