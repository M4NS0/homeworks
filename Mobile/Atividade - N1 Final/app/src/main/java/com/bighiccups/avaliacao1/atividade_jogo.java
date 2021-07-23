package com.bighiccups.avaliacao1;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class atividade_jogo extends AppCompatActivity {


    ImageButton btn_pedra, btn_papel, btn_tesoura;
    ImageView img_escolha_maquina, img_escolha_humano;
    TextView txt_resultado_jogo;
    private int jogadaDoHumano = 0;
    private int jogadaDoPc = 0;
    SoundPool snd;
    int draw,win,lose;
    final int min = 1;
    final int max = 3;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_de_jogo);

        btn_pedra = findViewById(R.id.btn_pedra);
        btn_papel = findViewById(R.id.btn_papel);
        btn_tesoura = findViewById(R.id.btn_tesoura);

        img_escolha_maquina = findViewById(R.id.img_escolha_maquina);
        img_escolha_humano = findViewById(R.id.img_escolha_humano);

        txt_resultado_jogo = findViewById(R.id.txt_resultado_jogo);

        int[] intArray = {  1,  //pedra
                            2,  //papel
                            3   //tesoura
        };




        //int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);

        snd = new SoundPool(4, AudioManager.STREAM_MUSIC,0);
        draw = snd.load((atividade_jogo.this),R.raw.draw, 1);
        win = snd.load((atividade_jogo.this),R.raw.win_short, 1);
        lose = snd.load((atividade_jogo.this),R.raw.lose_short, 1);

        btn_pedra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jogadaDoPc = (int)Math.floor(Math.random()*(max-min+1)+min);
                jogadaDoHumano = 1;

                try {
                    calcularJogada(jogadaDoHumano, jogadaDoPc);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });
        btn_papel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jogadaDoPc = (int)Math.floor(Math.random()*(max-min+1)+min);
                jogadaDoHumano = 2;
                try {
                    calcularJogada(jogadaDoHumano, jogadaDoPc);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
        btn_tesoura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jogadaDoPc = (int)Math.floor(Math.random()*(max-min+1)+min);
                jogadaDoHumano = 3;
                try {
                    calcularJogada(jogadaDoHumano, jogadaDoPc);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private void calcularJogada(Integer jogadaHumano, int jogadaDoPc) throws InterruptedException {

        if (jogadaDoPc == 1 && jogadaHumano == 1) {
            snd.play(draw, 1,1,1,0,1);
            Thread.sleep(2000);
            img_escolha_maquina.setImageResource(R.drawable.rock);
            img_escolha_humano.setImageResource(R.drawable.rock);
            txt_resultado_jogo.setText("Empate!");
            zeraResultado();
        }
        if (jogadaDoPc == 1 && jogadaHumano == 2) {
            snd.play(win, 1,1,1,0,1);
            Thread.sleep(6000);
            img_escolha_maquina.setImageResource(R.drawable.rock);
            img_escolha_humano.setImageResource(R.drawable.paper);
            txt_resultado_jogo.setText("Você Ganhou!");
            zeraResultado();
        }
        if (jogadaDoPc == 1 && jogadaHumano == 3) {
            snd.play(lose, 1,1,1,0,1);
            Thread.sleep(4000);
            img_escolha_maquina.setImageResource(R.drawable.rock);
            img_escolha_humano.setImageResource(R.drawable.scissors);
            txt_resultado_jogo.setText("Você Perdeu!");
            zeraResultado();
        }
        if (jogadaDoPc == 2 && jogadaHumano == 1) {
            snd.play(lose, 1,1,1,0,1);
            Thread.sleep(4000);
            img_escolha_maquina.setImageResource(R.drawable.paper);
            img_escolha_humano.setImageResource(R.drawable.rock);
            txt_resultado_jogo.setText("Você Perdeu!");
            zeraResultado();
        }
        if (jogadaDoPc == 2 && jogadaHumano == 2) {
            snd.play(draw, 1,1,1,0,1);
            Thread.sleep(2000);
            img_escolha_maquina.setImageResource(R.drawable.paper);
            img_escolha_humano.setImageResource(R.drawable.paper);
            txt_resultado_jogo.setText("Empate!");
            zeraResultado();
        }
        if (jogadaDoPc == 2 && jogadaHumano == 3) {
            snd.play(win, 1,1,1,0,1);
            Thread.sleep(4000);
            img_escolha_maquina.setImageResource(R.drawable.paper);
            img_escolha_humano.setImageResource(R.drawable.scissors);

            txt_resultado_jogo.setText("Você Ganhou!");
            zeraResultado();
        }
        if (jogadaDoPc == 3 && jogadaHumano == 1) {
            snd.play(win, 1,1,1,0,1);
            Thread.sleep(6000);
            img_escolha_maquina.setImageResource(R.drawable.scissors);
            img_escolha_humano.setImageResource(R.drawable.rock);

            txt_resultado_jogo.setText("Você Ganhou!");
            zeraResultado();
        }
        if (jogadaDoPc == 3 && jogadaHumano == 2) {
            snd.play(lose, 1,1,1,0,1);
            Thread.sleep(4000);
            img_escolha_maquina.setImageResource(R.drawable.scissors);
            img_escolha_humano.setImageResource(R.drawable.paper);

            txt_resultado_jogo.setText("Você Perdeu!");
            zeraResultado();
        }
        if (jogadaDoPc == 3 && jogadaHumano == 3) {
            snd.play(draw, 1,1,1,0,1);
            Thread.sleep(2000);
            img_escolha_maquina.setImageResource(R.drawable.scissors);
            img_escolha_humano.setImageResource(R.drawable.scissors);
            txt_resultado_jogo.setText("Empate!");
            zeraResultado();
        }

    }

    private void zeraResultado() {
        jogadaDoHumano = 0;
        jogadaDoPc = 0;
    }


}
