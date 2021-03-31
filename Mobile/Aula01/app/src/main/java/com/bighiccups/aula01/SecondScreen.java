package com.bighiccups.aula01;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.sql.Array;
import java.util.Arrays;

public class SecondScreen extends AppCompatActivity {
    TextView txt1, resultado;
    EditText campo1;
    EditText campo2;
    EditText campo3;
    EditText campo4;
    Button btnOrdenar, retornar;
    public long[] valor = new long[4];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_2);


        txt1 = (TextView) findViewById(R.id.txt1);
        campo1 = findViewById(R.id.campo1);
        campo2 = findViewById(R.id.campo2);
        campo3 = findViewById(R.id.campo3);
        campo4 = findViewById(R.id.campo4);
        resultado = findViewById(R.id.resultado);
        btnOrdenar = findViewById(R.id.btnOrdenar);
        retornar = findViewById(R.id.retornar);


        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        txt1.setText("Bem Vindo, " + str + "\nOrdene aqui seus números:");

        btnOrdenar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                valor[0] = Long.valueOf(campo1.getText().toString());
                valor[1] = Long.valueOf(campo2.getText().toString());
                valor[2] = Long.valueOf(campo3.getText().toString());
                valor[3] = Long.valueOf(campo4.getText().toString());

                resultado.setText(
                        "Valor     original: " + buffering(valor) +
                        "\nOrdem   crescente: " + ordemCrescente(valor) +
                        "\nOrdem decrescente: " + ordemInverter(valor));
            }
        });

        retornar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondScreen.this, MainActivity.class);
                startActivity(intent);
                finish();


            }
        });
    }

    private String ordemCrescente(long[] valor) {
        boolean flag;
        do {
            flag = false;
            for (int i = 0; i < valor.length - 1; i++) {
                if (valor[i] > valor[i + 1]) {
                    long aux = valor[i];
                    valor[i] = valor[i + 1];
                    valor[i + 1] = aux;
                    flag = true;
                }
            }
        } while (flag);
        return buffering(valor);
    }

    private String ordemInverter(long[] valor) {
        String str = buffering(valor);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb.reverse().toString();
    }


    private String buffering (long[] valor) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < valor.length; i++) {
            sb.append(valor[i]);
        }
        String str = sb.toString();
        return str;
    }



}