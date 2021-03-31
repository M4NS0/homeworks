package com.bighiccups.aula08a;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SegundaTela extends AppCompatActivity {
    ListView listView;
    Button btn02;
    String nome;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda_tela);

        listView = findViewById(R.id.listView);
        btn02 = findViewById(R.id.btn02);

        Intent pegaDados = getIntent();
        nome = pegaDados.getStringExtra("nome");

        ArrayList<String> nomesListagem = new ArrayList<>();
        nomesListagem.add("Maricotinha");
        nomesListagem.add("Patrício");
        nomesListagem.add("Fábio Ayala");
        nomesListagem.add(nome);
        nomesListagem.add("Humberto");
        nomesListagem.add("Shyrleon Junior");
        nomesListagem.add ("Tygor Phillipe");

        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,nomesListagem);
        listView.setAdapter(adapter);

        btn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SegundaTela.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });


    }
}
