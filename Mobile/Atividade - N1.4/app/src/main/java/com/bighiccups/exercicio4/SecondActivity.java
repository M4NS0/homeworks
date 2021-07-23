package com.bighiccups.exercicio4;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class SecondActivity extends AppCompatActivity {
    ListView listaTela2;
    Button adicionar;

    String nome;
    int identificacao;
    Double preco;

    ArrayList<Produtos> lista = new ArrayList<>();
    AdaptadorCustomizado adaptadorCustomizado;

    Bundle extras;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_2);

        listaTela2 = findViewById(R.id.lista);
        adicionar = findViewById(R.id.btn_adicionar_novo);

        Intent intent = getIntent();
        extras = intent.getExtras();

        nome = extras.getString("nome");
        identificacao = Integer.parseInt(extras.getString("id"));
        preco = Double.parseDouble((extras.getString("preco")));


        Produtos produto = new Produtos(nome,identificacao,preco);
        lista.add(produto);

        produto = new Produtos("Papel",1,8.50);
        lista.add(produto);

        produto = new Produtos("Borracha",2,1.50);
        lista.add(produto);

        produto = new Produtos("Grafite",3,5.50);
        lista.add(produto);




        adaptadorCustomizado = new AdaptadorCustomizado(this, R.layout.layout_lista, lista);
        listaTela2.setAdapter(adaptadorCustomizado);


        listaTela2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(SecondActivity.this, ThridActivity.class);

                Bundle extras = new Bundle();
                extras.putString("nome", lista.get(position).getNome());
                extras.putString("id", String.valueOf(lista.get(position).getId()));
                extras.putString("preco", String.valueOf(lista.get(position).getPreco()));

                intent.putExtras(extras);
                startActivity(intent);
            }
        });


        adicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });

}

}
