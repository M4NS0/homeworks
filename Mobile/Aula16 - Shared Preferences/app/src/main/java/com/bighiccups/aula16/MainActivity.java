package com.bighiccups.aula16;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button avancar, okL, okP;
    TextView resposta;
    EditText entrada;
    String texto;
    SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int orientation = getResources().getConfiguration().orientation;

        if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.activity_main_portrait);
              okP = findViewById(R.id.btnOkPortrait);
                resposta = findViewById(R.id.saida);

        } else {
            setContentView(R.layout.activity_main_landscape);
            okL = findViewById(R.id.btnOkLandscape);
            resposta = findViewById(R.id.resposta);
        }

        avancar = findViewById(R.id.btnProx);

        entrada = findViewById(R.id.EdTexto);

        prefs = getSharedPreferences("texto",MODE_PRIVATE);
        texto =  prefs.getString("texto","texto aqui");
        resposta.setText(texto); // erro aqui ver aula

        avancar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SegundaTela.class);
                startActivity(i);
                finish();
            }
        });

    }

    public void passaTexto(View view) {
        texto = entrada.getText().toString();
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("texto",texto);
        editor.apply();
        resposta.setText(texto);

    }



}