package com.bighiccups.aula14;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView moq1,moq2,moq3,moq4,moq5,moq6,moq7,moq8;
    ProgressBar progressBar;
    TextView txtPts, txtPtMax, texto;
    Button btnIniciar;
    Random r;

    int pontos = 0, ptMax = 0, fps = 1000, tempo = 0, tempoFinal = 0, tempoMs = 250;
    int imgAtiva = 0, imgAtivaSalva = 0;

    AnimationDrawable an;

    SoundPool snd;
    int sMosq, sSplat, sEnd;
    MediaPlayer music;
    Boolean tocar = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        moq1 = findViewById(R.id.mosquito1);
        moq2 = findViewById(R.id.mosquito2);
        moq3 = findViewById(R.id.mosquito3);
        moq4 = findViewById(R.id.mosquito4);
        moq5 = findViewById(R.id.mosquito5);
        moq6 = findViewById(R.id.mosquito6);
        moq7 = findViewById(R.id.mosquito7);
        moq8 = findViewById(R.id.mosquito8);

        moq1.setVisibility(View.INVISIBLE);
        moq2.setVisibility(View.INVISIBLE);
        moq3.setVisibility(View.INVISIBLE);
        moq4.setVisibility(View.INVISIBLE);
        moq5.setVisibility(View.INVISIBLE);
        moq6.setVisibility(View.INVISIBLE);
        moq7.setVisibility(View.INVISIBLE);
        moq8.setVisibility(View.INVISIBLE);

        progressBar = findViewById(R.id.progressBar);
        txtPts = findViewById(R.id.pts);
        texto = findViewById(R.id.texto);
        txtPtMax = findViewById(R.id.record);

        btnIniciar = findViewById(R.id.btnIniciar);

        // inicio dos efeitos sonoros

        snd = new SoundPool(5, AudioManager.STREAM_MUSIC,0);
        sMosq = snd.load(MainActivity.this, R.raw.s_mosquito, 3);
        sSplat = snd.load(MainActivity.this,R.raw.s_kill_the_fly,1);
        sEnd = snd.load(MainActivity.this,R.raw.s_end, 1);

        music = MediaPlayer.create(MainActivity.this,R.raw.m_casino);

        // persistencia de dados

        SharedPreferences preferences = getSharedPreferences("recorde", MODE_PRIVATE);
        ptMax = preferences.getInt("record",0);
        txtPtMax.setText("Recorde: " + ptMax);

        r = new Random();

        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pontos = 0;
                tempo = 100;
                music.start();
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    texto.setTextColor(getColor(R.color.red_blood));
                }
                txtPts.setText("Pontos: " + pontos);

                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        minhaEngine();
                    }
                }, 1000);
                btnIniciar.setEnabled(false);
                final Handler handler2 = new Handler();

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (tempo > tempoFinal) {  //durante
                            tempo --;
                            if (tempo < 0 ) tempo = 0;
                            SystemClock.sleep(tempoMs);
                            handler2.post(new Runnable() {
                                @Override
                                public void run() {
                                    progressBar.setProgress(tempo);
                                }
                            });
                        }
                    }
                }).start();
            }
        });
        moq1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSet(moq1);
            }
        });
        moq2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSet(moq2);
            }
        });
        moq3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSet(moq3);
            }
        });
        moq4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSet(moq4);
            }
        });
        moq1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSet(moq1);
            }
        });
        moq5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSet(moq5);
            }
        });
        moq6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSet(moq6);
            }
        });
        moq7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSet(moq7);
            }
        });
        moq8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickSet(moq8);
            }
        });
    }

    private void clickSet(ImageView mosquito) {
        mosquito.setImageResource(R.drawable.red_splat);
        mosquito.setEnabled(false);
        mosquito.clearAnimation();
        snd.play(sSplat, 1,1,1, 0,1);
        snd.stop(sMosq);
        pontos ++;
        txtPts.setText("Pontos: " + pontos);
        tempo += 2;
        if(tempo >=100) tempo = 100;
    }

    // controle de tudo
    private void minhaEngine() {
        if(pontos < 10) fps  = 1000;
        else if (pontos > 10  && pontos < 20) fps = 950;
        else if (pontos > 20  && pontos < 30) fps = 900;
        else if (pontos > 30  && pontos < 40) fps = 850;
        else if (pontos > 40  && pontos < 50) fps = 800;
        else if (pontos > 50  && pontos < 60) fps = 750;
        else if (pontos > 60  && pontos < 70) fps = 700;
        else if (pontos > 70  && pontos < 80) fps = 650;
        else if (pontos > 80  && pontos < 90) fps = 600;
        else if (pontos > 90  && pontos < 100) fps = 550;
        else fps = 500;

        an = (AnimationDrawable) ContextCompat.getDrawable(this, R.drawable.animar_mosquito);
        do {
            imgAtiva = r.nextInt(8)+1;
        } while (imgAtivaSalva == imgAtiva);
        imgAtivaSalva = imgAtiva;
        if (imgAtiva == 1) ativaImagem(moq1,fps);
        else if (imgAtiva == 2) ativaImagem(moq2,fps);
        else if (imgAtiva == 3) ativaImagem(moq3,fps);
        else if (imgAtiva == 4) ativaImagem(moq4,fps);
        else if (imgAtiva == 5) ativaImagem(moq5,fps);
        else if (imgAtiva == 6) ativaImagem(moq6,fps);
        else if (imgAtiva == 7) ativaImagem(moq7,fps);
        else if (imgAtiva == 8) ativaImagem(moq8,fps);
        an.start();

        Handler handler = new Handler(); //controla imagens subindo e aparecendo
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                moq1.setVisibility(View.INVISIBLE);
                moq1.setEnabled(false);

                moq2.setVisibility(View.INVISIBLE);
                moq2.setEnabled(false);

                moq3.setVisibility(View.INVISIBLE);
                moq3.setEnabled(false);

                moq4.setVisibility(View.INVISIBLE);
                moq4.setEnabled(false);

                moq5.setVisibility(View.INVISIBLE);
                moq5.setEnabled(false);

                moq6.setVisibility(View.INVISIBLE);
                moq6.setEnabled(false);

                moq7.setVisibility(View.INVISIBLE);
                moq7.setEnabled(false);

                moq8.setVisibility(View.INVISIBLE);
                moq8.setEnabled(false);

                if(tempo < 1) {
                    Toast.makeText(MainActivity.this, "Game Over!", Toast.LENGTH_SHORT).show();
                    btnIniciar.setEnabled(true);
                    if (pontos > ptMax ) ptMax = pontos;
                    txtPtMax.setText("Recorde: " + ptMax);

                    // persistencia
                    SharedPreferences preferences = getSharedPreferences("recorde", MODE_PRIVATE);
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putInt("recorde",ptMax);
                    editor.apply();

                    texto.setTextColor(Color.BLACK);
                    snd.play(sEnd,1,1,1,0,1);
                    music.pause();
                    music.seekTo(0); // musica volta pro inicio
                } else minhaEngine();
            }
        }, fps);
    }

    private void ativaImagem(ImageView mosquito, int fps) {
        mosquito.setImageDrawable(an);  // mosquito executa animacoa
        mosquito.setVisibility(View.VISIBLE);
        snd.play(sMosq,0.3f,0.3f,3,0,1);
        mosquito.setEnabled(true);

        // movimentando em circulos

        Animation anim = new CircularAnimation(mosquito, 10);
        anim.setDuration(fps);
        mosquito.setAnimation(anim);
    }

    @Override
    protected void onPause() {
        super.onPause();
        music.stop();
        snd.release();
        finish();
    }

    @Override
    public void onBackPressed() {
        music.stop();
        snd.release();
        finish();
    }
}