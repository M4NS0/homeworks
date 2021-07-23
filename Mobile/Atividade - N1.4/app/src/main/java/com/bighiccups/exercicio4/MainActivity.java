package com.bighiccups.exercicio4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText nome, id, preco;
    Button registrar, ver_lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.nome);
        id = findViewById(R.id.id);
        preco = findViewById(R.id.preco);
        registrar = findViewById(R.id.registrar);


        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                Bundle extras = new Bundle();
                extras.putString("nome", nome.getText().toString());
                extras.putString("id", id.getText().toString());
                extras.putString("preco", preco.getText().toString());

                intent.putExtras(extras);
                startActivity(intent);

            }
        });

    }
}