package com.bighiccups.avaliacao1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class atividade_jogo extends AppCompatActivity {
    public static final String ROCK = "ROCK";
    public static final String PAPER = "PAPER";
    public static final String SCISSORS = "SCISSORS";

    ImageButton btn_pedra, btn_papel, btn_tesoura;
    ImageView img_escolha_maquina, img_escolha_humano;
    TextView txt_resultado_jogo;

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

        btn_pedra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img_escolha_humano.setImageResource(R.drawable.rock);


            }
        });
        btn_papel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img_escolha_humano.setImageResource(R.drawable.papel);

            }
        });
        btn_tesoura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img_escolha_humano.setImageResource(R.drawable.scissors);

            }
        });

    }


}
