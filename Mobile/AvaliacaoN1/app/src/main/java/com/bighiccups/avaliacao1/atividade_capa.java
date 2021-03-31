package com.bighiccups.avaliacao1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class atividade_capa extends AppCompatActivity {
    Button btnEntrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.capa);
        btnEntrar = findViewById(R.id.acessarTrabalho);

        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(atividade_capa.this,atividade_menu.class);
                startActivity(i);
            }
        });
    }
}