package com.bighiccups.exercicio4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ThridActivity extends AppCompatActivity {
    Button voltar;

    private String nome;
    private String id;
    private String preco;

    TextView mostraNome;
    TextView mostraId;
    TextView mostraPreco;

    Bundle extras;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_produto);

        voltar = findViewById(R.id.voltar);

        mostraNome = findViewById(R.id.nome_do_produto);
        mostraId = findViewById(R.id.id_do_produto);
        mostraPreco = findViewById(R.id.preco_do_produto);

        Intent intent = getIntent();
        extras = intent.getExtras();

        nome = extras.getString("nome");
        id = extras.getString("id");
        preco = extras.getString("preco");

        mostraId.setText("Produto número: " + id + "");
        mostraNome.setText(nome);
        mostraPreco.setText(preco + " R$");

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThridActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
