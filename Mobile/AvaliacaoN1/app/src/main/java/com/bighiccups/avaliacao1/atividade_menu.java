package com.bighiccups.avaliacao1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class atividade_menu extends AppCompatActivity {
    ImageButton btnGerador, btnJogo, btnInversor, btnRegistro;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_de_menu);
        btnGerador = findViewById(R.id.btnGerador);
        btnJogo = findViewById(R.id.btnJogo);
        btnInversor = findViewById(R.id.btnInversor);
        btnRegistro = findViewById(R.id.btnRegistro);

        btnGerador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(atividade_menu.this,atividade_gerador.class);
                startActivity(i);
            }
        });

        btnJogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(atividade_menu.this,atividade_jogo.class);
                startActivity(i);
            }
        });

        btnInversor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(atividade_menu.this,atividade_inversor.class);
                startActivity(i);
            }
        });

        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(atividade_menu.this,atividade_registro.class);
                startActivity(i);
            }
        });
    }
}
