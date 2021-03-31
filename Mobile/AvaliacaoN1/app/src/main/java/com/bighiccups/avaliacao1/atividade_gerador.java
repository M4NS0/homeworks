package com.bighiccups.avaliacao1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class atividade_gerador extends AppCompatActivity {
    Button btnGerar;
    TextView resposta;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_de_gerador);
        btnGerar = findViewById(R.id.btn_gerar);
        resposta = findViewById(R.id.resultadoGerado);

        btnGerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int min = 0;
                int max = 9999;

                resposta.setText(String.valueOf(min + (int)(Math.random() * ((max - min) + 1))));


            }
        });
    }
}
