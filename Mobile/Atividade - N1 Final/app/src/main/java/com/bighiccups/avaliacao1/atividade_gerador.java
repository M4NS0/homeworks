package com.bighiccups.avaliacao1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class atividade_gerador extends AppCompatActivity {
    Button btnGerar;
    TextView resposta;
    EditText et_minimo, et_maximo;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_de_gerador);
        btnGerar = findViewById(R.id.btn_gerar);
        resposta = findViewById(R.id.resultadoGerado);
        et_maximo = findViewById(R.id.et_maximo);
        et_minimo = findViewById(R.id.et_minimo);

        btnGerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int min = Integer.parseInt(String.valueOf(et_minimo.getText()));
                int max = Integer.parseInt(String.valueOf(et_maximo.getText()));

                resposta.setText(String.valueOf(min + (int)(Math.random() * ((max - min) + 1))));


            }
        });
    }
}
